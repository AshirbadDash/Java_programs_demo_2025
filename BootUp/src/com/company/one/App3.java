package com.company.one;

import java.util.Scanner;

public class App3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;

		do {

			System.out.println("enter the number to check even odd");
			int num = sc.nextInt();

			if (num % 2 == 0) {
				System.out.println(num + " is even");
			} else {
				System.out.println(num + " is odd");
			}

			System.out.println("do you want to check for another number? (y/n): ");
			choice = sc.next().toLowerCase().charAt(0);
		} while (choice == 'y');
		System.out.println("👋 GoodBye");
		sc.close();
	}

}
