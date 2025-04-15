package com.company;

import java.util.Scanner;

public class App5 {
	// display all the substring of a string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user please enter the string");
		String input = sc.nextLine();
		sc.close();
		findSubstr(input);
		findSubstringsWithoutSubstring(input);

	}

	public static void findSubstr(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				System.out.println(input.substring(i, j));
				count++;

			}

		}
		System.out.println("Total Substrings " + count);
	}

	public static void findSubstringsWithoutSubstring(String input) {
		int len = input.length();

		for (int i = 0; i < len; i++) {
			String temp = ""; // or use StringBuilder for efficiency
			for (int j = i; j < len; j++) {
				temp += input.charAt(j); // build substring char by char
				System.out.println(temp);
			}
		}

	}
}
