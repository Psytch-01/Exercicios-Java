package src.exercicios.controle;

import java.util.Scanner;

public class RestoZero {
    public static void main(String[] args) {
        System.out.println("Pick a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (true){
            System.out.println("Pick another number: ");
            int num2 = sc.nextInt();

            if (num2 < num) {
                System.out.println("The number has been ignored because it is smaller than the first one.");
                continue;
            } else if (num2 % num != 0) {
                System.out.println("Número não divisivel pelo primeiro numero. O programa está sendo encerrado.");
                break;
            }
        }

        sc.close();
    }
}
