package src.exercicios.controle;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Pick a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Pick another number: ");
        int num2 = sc.nextInt();

        if (num2 < num) {
            while (num2 < num) {
                System.out.println("The second number must be bigger than the first one");
                num2 = sc.nextInt();
            }
        }else if (num2 > num) {
            System.out.println("Você deseja mostrar números pares ou ímpares?");
            Scanner sc1 = new Scanner(System.in);

            String evenOrOdd = sc1.nextLine();

            if (evenOrOdd.equals("pares")) {
                for (int i = num2; i > num; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }

            }else if (evenOrOdd.equals("impares")) {
                for (int i = num2; i > num; i--) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
