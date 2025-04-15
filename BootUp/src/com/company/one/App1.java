package com.company.one;

import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("user please enter 1st number: ");
		int num1 = sc.nextInt();

		System.out.print("user please enter the 2nd number: ");
		int num2 = sc.nextInt();
		System.out.print("user please enter the 3rd number: ");
		int num3 = sc.nextInt();

		sc.close();
		twoGreater(num1, num2, num3);
		threeGreater(num1, num2, num3);
		threeGreater2(num1, num2, num3);

	}

	public static void threeGreater2(int a, int b, int c) {

		if (a > b) {
			if (a > c) {
				System.out.print(a + " is greater");
			} else {
				System.out.print(c + " is greater");
			}
		} else if (b > c) {
			System.out.println(b + " is greater");
		} else {
			System.out.println(c + " is greater");
		}

	}

	public static void twoGreater(int num1, int num2, int num3) {

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);

		} else

			System.out.println(num2 + " is greater than " + num1);

	}

	public static void threeGreater(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {

			System.out.println(num1 + " is greater than " + num2 + " and " + num3);
		} else if (num2 > num3 && num2 > num1) {

			System.out.println(num2 + " is greater than " + num1 + "and " + num3);
		} else {
			System.out.println(num3 + " is greater");
		}
	}

}
