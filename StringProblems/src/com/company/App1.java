package com.company;

import java.util.Scanner;

public class App1 {
	// print all characters separated by space in same line using for loop

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input ");
		String input = sc.nextLine();

		sc.close();

		f1(input);
	}

	public static void f1(String arg) {
		for (int i = 0; i < arg.length(); i++) {
			char c = arg.charAt(i);
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(c);
		}
//		for (char c : arg.toCharArray()) {
//			System.out.print(" " + c);
//		}

	}

}
