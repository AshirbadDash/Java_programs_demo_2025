package com.program;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		System.out.print("number: ");
		int num = sc.nextInt();

		reverse(num);
		reverse2(num);
		reverse3(num);
		reverse4(sc);
	}

	public static void reverse(int num) {
		int rev = 0;
		int ori = num;

		System.out.println("original number is " + ori);
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("reverse number is " + rev);
	}

	public static void reverse2(int num) {
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		
		rev = sb.reverse();
		System.out.println(rev);

	}

	public static void reverse3(int num) {
		StringBuilder sb = new StringBuilder();
		sb.append(false);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
	}

	public static void reverse4(Scanner sc) {
		sc.nextLine();
		String rev = sc.nextLine();
		for (int i = rev.length(); i >= 0; i--) {
			rev += rev.charAt(i - 1);
		}
		System.out.println(rev);

	}
}
