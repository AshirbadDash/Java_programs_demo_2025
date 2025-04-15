package com.company;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("enter the number to reverse");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		sc.close();

		rev1(num);
	}

	static void rev1(int num) {
		int rev = 0;

		System.out.println("the number before reverse is: " + num);

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The reversed number is: " + rev);

	}

	// using string buffer class
	static void rev2(int num) {
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();

	}

	// using string builder class
	static void rev3(int num) {
		StringBuilder rev;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		rev = sb.reverse();

	}

}
