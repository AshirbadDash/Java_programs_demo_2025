package com.practice.prog;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String s = scan.next();

		System.out.println("int is " + n);
		System.out.println("String is " + s);
		scan.close();

	}

}
