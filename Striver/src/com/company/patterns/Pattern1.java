package com.company.patterns;

import java.util.Scanner;

public class Pattern1 {

	/**
	 * patterns will have nested loops
	 * 
	 * outer loop are basically for rows/lines
	 *
	 * inner loop is basically for the columns
	 * 
	 * focus on the columns and connect them somehow with the rows
	 * 
	 * print everything inside inner for loop
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter the number of rows");
		int size = scan.nextInt();
		star1(size);
		scan.close();
	}

	public static void pattern1(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern2(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern3(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern4(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern5(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void pattern6(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void star1(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
