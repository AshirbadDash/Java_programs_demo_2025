package com.problems;

import java.util.Scanner;

public class Print8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String rev = "";
		scan.close();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			rev = c + rev;

		}
		System.out.println(rev);

	}

}
