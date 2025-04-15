package com.company;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i <= 5; i++) {
			System.out.print("* ");
		}
		System.out.println(i);
		profit_Loss();

	}

	static void profit_Loss() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the Cost price");
		int cp = sc.nextInt();
		System.out.println("enter the Selling price");
		int sp = sc.nextInt();
		int profit = 0;
		int loss = 0;
		if (cp < sp) {
			profit = sp - cp;
			System.out.println("The profit is: " + profit);

		} else {

			loss = cp - sp;

			System.out.println("The loss is: " + loss);

		}

	}
}
