package com.company.striver.pattern;

public class Pattern2 {
	public static void main(String[] args) {
		/**
		 * 1. no of lines =no of rows =no of times the outer row will run
		 * 
		 * 2.identify for every row no how many column are there or types of elements in
		 * the column
		 * 
		 * 3.what is needed to print
		 * 
		 * 
		 * 
		 */
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
