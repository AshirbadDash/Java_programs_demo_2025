package com.company;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2 numbers to swap");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
//		swap1(num1,num2);
//		swap2(num1,num2);
//		swap3(num1, num2);
		swap4(num1, num2);

	}

	// using 3rd variable
	static void swap1(int num1, int num2) {
		System.out.println("Numbers before swapping are: " + num1 + " and " + num2);
		int a = num1;
		int b = num2;

		int c = a;
		a = b;
		b = c;

		System.out.println("----------------------------");

		System.out.println("Numbers after swapping are: " + a + " and " + b);

	}

	// using + and -
	static void swap2(int num1, int num2) {
		System.out.println("Numbers before swapping are: " + num1 + " and " + num2);

		num1 = num1 + num2;

		num2 = num1 - num2;

		num1 = num1 - num2;

		System.out.println("Numbers after swapping are: " + num1 + " and " + num2);
	}

	// using * and / note-this work only with numbers with all values except zero
	// else
	// it will throw arithmetic exception
	static void swap3(int num1, int num2) {

		System.out.println("Numbers before swapping are: " + num1 + " and " + num2);

		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;

		System.out.println("Numbers after swapping are: " + num1 + " and " + num2);

	}

	// using single statement
	static void swap4(int num1,int num2) {
		System.out.println("Numbers before swapping are: "+num1+" and "+num2);
		num2=num1+num2 -(num1=num2);
		System.out.println("Numbers after swapping are: "+num1+" and "+num2);
	}

}
