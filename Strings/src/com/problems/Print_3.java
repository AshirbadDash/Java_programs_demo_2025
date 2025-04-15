package com.problems;

import java.util.Scanner;

public class Print_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User please enter the string");
		String input = sc.nextLine();
		int countUpper = 0;
		int countLower = 0;
		String lowerCase = "";
		String upperCase = "";
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				countUpper++;
				upperCase += c;

			}
			if (Character.isLowerCase(c)) {

				countLower++;
				lowerCase += c;

			}
			if (Character.isDigit(c)) {
				System.out.println("it is " + c);
			}
		}
		System.out.println("No Of Upper CaseLetter" + " " + countUpper + " " + upperCase + " ");
		System.out.println("No Of Lower CaseLetter" + " " + countLower + " " + lowerCase + " ");

	}
}
