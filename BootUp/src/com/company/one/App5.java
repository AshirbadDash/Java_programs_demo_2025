package com.company.one;

import java.util.Scanner;

public class App5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();

		sc.close();

		int temp;

//		temp = a;
//		a = b;
//		b = temp;
//

//		a=a+b;
//		b=a-b;
//		a=a-b;
//		

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println(a + "," + b);
	}

}
