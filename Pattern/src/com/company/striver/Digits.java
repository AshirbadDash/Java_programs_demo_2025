package com.company.striver;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();

		int rev = 0;
		int lastDigit = 0;
		int count = 0;

		while (num > 0) {
			lastDigit = num % 10; // Extract last digit
			rev = (rev * 10) + lastDigit; // Correct position of reversing logic
			num = num / 10; // Remove last digit
			count++;
		}

		System.out.println("Total Digits: " + count);
		System.out.println("Last Digit: " + lastDigit);
		System.out.println("Reversed Number: " + rev);
	}
}
