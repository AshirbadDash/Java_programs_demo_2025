package com.company;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (!checkPalindrome(num)) {
			System.out.println(num + " is not a palindrome number");
		} else {
			System.out.println(num + " is a palindrome number");
		}
		sc.close();

	}

	private static boolean checkPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return temp == rev;

	}

	private static boolean checkPalindrome(String str) {
		String temp = str;
		String rev = "";

		return false;

	}

}
