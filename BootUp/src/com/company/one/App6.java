package com.company.one;

import java.util.Scanner;

public class App6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice;

		do {
			System.out.println("Enter '+' to add two numbers or 'n' to exit:");
			choice = sc.next().toLowerCase().charAt(0);

			switch (choice) {
			case '+':
				System.out.println("Enter two numbers:");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int result = num1 + num2;
				System.out.println("Result: " + result);
				break;
			case 'n':
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 'n');

		sc.close();
		System.out.println("goodBye 👋");
	}
}
