package com.company.demo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {

			System.out.print("Enter number1: ");
			int num1 = sc.nextInt();
			System.out.print("Enter number2: ");
			int num2 = sc.nextInt();
			sum(num1, num2);
			
		}
		sc.close();
	}

	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("sum: " + result);
	}

}
