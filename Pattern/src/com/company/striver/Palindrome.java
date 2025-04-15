package com.company.striver;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User please enter the number to check palindrome");

		int num = sc.nextInt();
		sc.close();
		boolean result = check_palindrome(num);
		if (result) {

			System.out.println(result);
		} else {
			System.out.println("This is not a palindrome number");
		}

	}

	static boolean check_palindrome(int num) {
		int original = num;
		int reverse = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}
		boolean result = (original == reverse);
		return result;

	}
}
