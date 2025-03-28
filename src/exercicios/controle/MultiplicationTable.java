package src.exercicios.controle;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a number: ");

        int userNumber = userInput.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d\n", userNumber, i, (userNumber * i));

        }
        userInput.close();
    }
}
