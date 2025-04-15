package com.company.one;

import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 4 == 0) {
			if (num % 100 == 0) {
				if (num % 400 == 0) {
					System.out.println("it is a leap");
				} else {
					System.out.println("it is not a leap year");
				}

			} else {
				System.out.println("it is a leap year");
			}
		} else {
			System.out.println("not a leap year");
		}

		sc.close();
	}

}
