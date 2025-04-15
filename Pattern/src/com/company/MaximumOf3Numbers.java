package com.company;

import java.util.Scanner;

public class MaximumOf3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the three numbers to find the maximum");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is the maximum");
		} else if (n2 > n1 && n2 > n3) {

			System.out.println(n2 + " is the maximum");

		} else {
			System.out.println(n3 + " is the maximum");
		}

	}

}
