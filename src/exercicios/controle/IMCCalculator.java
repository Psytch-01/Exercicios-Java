package src.exercicios.controle;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {

        System.out.println("Digite o sua altura: ");
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();
        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");

        }else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso ideal");

        }else if (imc >= 25 && imc < 29.9) {
            System.out.println("Levemente acima do peso");

        }else if (imc >= 30 && imc < 34.9) {
            System.out.println("Obesidade Grau 1");

        }else if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidade Grau 2 (Severa)");

        }else if (imc >= 40) {
            System.out.println("Obesidade Grau 3 (Mórbida)");

        }else {
            System.out.println("IMC invalido");
        }
        sc.close();
    }
}
