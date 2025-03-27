package src.exercicios.fundamentos;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the Rectangle: ");

        String userImput = scanner.next();
        userImput = userImput.replace(",",".");

        try {
            double sideLength = Double.parseDouble(userImput);

            System.out.println("Enter the base length of the Rectangle: ");

            String userImput2 = scanner.next();
            userImput2 = userImput2.replace(",",".");

            double baseLength = Double.parseDouble(userImput2);

            double area = sideLength * baseLength;
            System.out.println("The square area is " + String.format("%.2f", area));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
        }
    }
}

