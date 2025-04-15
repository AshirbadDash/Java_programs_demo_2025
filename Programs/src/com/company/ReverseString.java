package com.company;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("enter the number to be reversed");
		Scanner sc = new Scanner(System.in);
		String str	= sc.next();

		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("the reversed String is: " + rev);
	}

}
