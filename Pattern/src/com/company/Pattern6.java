package com.company;

public class Pattern6 {
	public static void main(String[] args) {
		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(i * j * 100 + " ");
				if (j == 1) {
					System.out.println();
				}
			}
			System.out.println();
		}
	}

}
