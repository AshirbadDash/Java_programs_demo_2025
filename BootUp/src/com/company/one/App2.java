package com.company.one;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {

		System.out.println("enter how many numbers");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("invalid input range");
			return;
		}
		System.out.println("Enter " + n + " numbers");
		int greatest = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int num = sc.nextInt();
			if (num > greatest) {
				greatest = num;
			}

		}
		System.out.println("greatest number is " + greatest);

		sc.close();
	}

}
