package com.company;

import java.util.Scanner;

public class Calculator_Application {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        while (true) {
            System.out.println("User! please press the number according to the operation");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Even or Odd");
            System.out.println("7. Exit");
            System.out.println("-------------------------------------------------------------");
            System.out.print("Enter your choice: ");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    remainder();
                    break;
                case 6:
                    even_odd();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    private static void add() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    private static void sub() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = num1 - num2;
        System.out.println("The difference is: " + result);
    }

    private static void mul() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int product = num1 * num2;
        System.out.println("The product is: " + product);
    }

    private static void divide() {
        System.out.print("Enter numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
        } else {
            double quotient = (double) num1 / num2;
            System.out.println("The quotient is: " + quotient);
        }
    }

    private static void remainder() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int rem = num1 % num2;
        System.out.println("The remainder is: " + rem);
    }

    private static void even_odd() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
}
