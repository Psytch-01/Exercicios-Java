package src.exercicios.fundamentos;

import java.time.Year;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        int currentYear = Year.now().getValue();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your birth year:");

        int birthYear = userInput.nextInt();
        int userAge = currentYear - birthYear;

        if (userAge >= 115) {
            System.out.println("You're dead, probably haha!");
        }else
            System.out.println("Your age is " + userAge + " years old.");
    }
}
