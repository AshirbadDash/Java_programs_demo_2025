package com.company;

import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {

		System.out.println("user please enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i) + " ");
		}
	}
}