package com.problems;

import java.util.Scanner;

//check vowel consonant
public class Print4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user please enter the sentence to check ");
		String input = sc.nextLine();

		String upperCase = "";
		int count = 0;
		String vowel = "";
		upperCase = input.toUpperCase();
		System.out.println(upperCase);
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				count++;
				vowel += c;
			}
		}
		System.out.println("No of vowel are " + count + "and they are");

	}
}
