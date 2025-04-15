package com.problems;

import java.util.Scanner;

public class Print5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("user please enter input");
		String input = sc.nextLine();

		String d = "";
		String r = "";
		System.out.println(r);
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				d += c;
			} else
				r += c;
		}
		String sen = d + r;
		System.out.println(sen);

	}
}
