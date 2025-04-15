package com.company;

import java.util.Scanner;

public class App2 {
	// display all the characters of a string using for/while and do-while loops for
	// each

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("user please enter the string");
		String input = sc.nextLine();
		sc.close();
		forLoop(input);
		whileLoop(input);
		doWhileLoop(input);
		forEach(input);

	}

	public static void forLoop(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");

		}

	}

	public static void whileLoop(String str) {
		int i = 0;
		while (i < str.length()) {
			System.out.print(str.charAt(i) + " ");
			i++;
		}

	}

	public static void doWhileLoop(String str) {
		int i = 0;
		do {
			System.out.print(str.charAt(i) + " ");
			i++;
		} while (i < str.length());
	}

	public static void forEach(String str) {
		for (char c : str.toCharArray()) {
			System.out.print(c + " ");

		}
	}

}
