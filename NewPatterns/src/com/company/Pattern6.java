package com.company;

public class Pattern6 {
	public static void main(String[] args) {
		int rows = 5;

		// Top half
		for (int i = 0; i < rows; i++) {
			for (int j = rows - 1; j > i; j--) {
				System.out.print(" "); // Using space for alignment
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Bottom half
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = rows - 1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
