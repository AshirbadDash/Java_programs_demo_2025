package com.company;

import java.util.Scanner;

public class SquareOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be squared");
		int num = sc.nextInt();
		sc.close();
		int result = square(num);
		System.out.println("the square of " + num + " is " + result);

	}

	public static int square(int num) {
		int result = (num * num);
		return result;

	}
}
