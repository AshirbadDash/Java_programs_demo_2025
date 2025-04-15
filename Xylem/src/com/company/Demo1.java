package com.company;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("enter the size of series");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		sc.close();

		int firstTerm = 0;
		int secondTerm = 1;

		for (int i = 1; i <= size; i++) {

			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}

	}

}
