package com.company.alphabets;

public class PrintD {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (i == 1 && j < n && j > 1) || (i == n && j < n && j > 1))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
