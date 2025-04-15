package com.problems;

import java.util.Scanner;

public class Print6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user please enter the input");
		String input = sc.nextLine();
		String reverse = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isUpperCase(c)) {
				reverse += Character.toLowerCase(c);

			} else {
				reverse += Character.toUpperCase(c);
			}
		}
		System.out.println(reverse);
		sc.close();
	}

}
