package src.exercicios.fundamentos;

import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("Enter the other age: ");
        int otherAge = sc.nextInt();

        if (age > otherAge) {
            int ageDifference = age - otherAge;
            System.out.println("You are " + ageDifference + " years older.");
        } else if (age < otherAge) {
            int ageDifference = otherAge - age;
            System.out.println("You are " + ageDifference + " years older.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
