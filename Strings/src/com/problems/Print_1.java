package com.problems;

import java.util.Scanner;

public class Print_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User please enter the string");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			System.out.println(c);
		}

	}
}
