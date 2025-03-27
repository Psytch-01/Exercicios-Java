package src.exercicios.fundamentos;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side length of the square: ");
        String userImput = sc.next();

        userImput = userImput.replace(",",".");

        double sideLength = Double.parseDouble(userImput);

       try {
           double area = sideLength * sideLength;
           System.out.println("The square area is " + String.format("%.2f", area));

       } catch (NumberFormatException e) {
           System.out.println("Invalid input format");
       }
    }
}
