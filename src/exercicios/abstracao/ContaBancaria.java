package src.exercicios.abstracao;

import java.util.Scanner;

public class ContaBancaria {

    private double saldo = 0;
    private double limiteChequeEspecial = 0;
    private double valorUsadoChequeEspecial = 0;
    private boolean usandoChequeEspecial = false;

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getSaldoTotal() {
        return saldo + limiteChequeEspecial;
    }

    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner entrada = new Scanner(System.in);
        int menuOpcoes = 0;

        while (menuOpcoes != -1) {
            System.out.println("\nEscolha uma opção:\n" +
                    "1 -> Criar nova conta\n" +
                    "2 -> Consultar saldo\n" +
                    "3 -> Consultar cheque especial\n" +
                    "4 -> Depositar dinheiro\n" +
                    "5 -> Sacar dinheiro\n" +
                    "6 -> Pagar boleto\n" +
                    "7 -> Verificar uso do cheque especial\n" +
                    "-1 -> Sair");
            menuOpcoes = entrada.nextInt();

            switch (menuOpcoes) {
                case 1:
                    contaBancaria.criarConta();
                    break;
                case 2:
                    System.out.println("Saldo atual: R$" + contaBancaria.getSaldoTotal());
                    break;
                case 3:
                    System.out.println("Cheque especial disponível: R$" + contaBancaria.getLimiteChequeEspecial());
                    break;
                case 4:
                    contaBancaria.depositarDinheiro();
                    break;
                case 5:
                    contaBancaria.sacarDinheiro();
                    break;
                case 6:
                    contaBancaria.pagarBoleto();
                    break;
                case 7:
                    contaBancaria.chequeEspecialEmUso();
                    break;
            }
        }
    }

    public void criarConta() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deposite um valor para criar a conta:");
        double deposito = entrada.nextDouble();

        if (deposito > 0 && deposito <= 500) {
            saldo += deposito;
            limiteChequeEspecial = 50;
        } else if (deposito > 500) {
            saldo += deposito;
            limiteChequeEspecial = deposito * 0.5;
        } else {
            System.out.println("Valor inválido para criação de conta!");
            return;
        }

        System.out.println("Conta criada com sucesso!");
        System.out.println("Saldo: R$" + getSaldoTotal() + " | Cheque especial: R$" + limiteChequeEspecial);
    }

    public void depositarDinheiro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado:");
        double deposito = entrada.nextDouble();

        if (usandoChequeEspecial && valorUsadoChequeEspecial > 0) {
            double taxa = valorUsadoChequeEspecial * 0.2;
            double totalDivida = valorUsadoChequeEspecial + taxa;

            if (deposito >= totalDivida) {
                deposito -= totalDivida;
                limiteChequeEspecial += valorUsadoChequeEspecial;
                valorUsadoChequeEspecial = 0;
                usandoChequeEspecial = false;
                System.out.println("Cheque especial quitado com taxa de R$" + taxa);
            } else {
                System.out.println("Depósito insuficiente para quitar o cheque especial e a taxa.");
                saldo += deposito;
                return;
            }
        }

        saldo += deposito;
        System.out.println("Depósito realizado. Saldo atual: R$" + getSaldoTotal());
    }

    public void sacarDinheiro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor a sacar:");
        double valor = entrada.nextDouble();

        if (saldo >= valor) {
            saldo -= valor;
        } else if ((saldo + limiteChequeEspecial) >= valor) {
            double restante = valor - saldo;
            saldo = 0;
            limiteChequeEspecial -= restante;
            valorUsadoChequeEspecial += restante;
            usandoChequeEspecial = true;
        } else {
            System.out.println("Saldo insuficiente.");
            return;
        }

        System.out.println("Saque realizado. Saldo atual: R$" + getSaldoTotal());
    }

    public void pagarBoleto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do boleto:");
        double boleto = entrada.nextDouble();

        if (saldo >= boleto) {
            saldo -= boleto;
        } else if ((saldo + limiteChequeEspecial) >= boleto) {
            double restante = boleto - saldo;
            saldo = 0;
            limiteChequeEspecial -= restante;
            valorUsadoChequeEspecial += restante;
            usandoChequeEspecial = true;
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
            return;
        }

        System.out.println("Boleto pago com sucesso. Saldo atual: R$" + getSaldoTotal());
    }

    public void chequeEspecialEmUso() {
        if (usandoChequeEspecial) {
            System.out.println("A conta está usando o cheque especial.");
        } else {
            System.out.println("A conta não está usando o cheque especial.");
        }
    }
}
