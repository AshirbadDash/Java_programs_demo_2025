package com.company;

import java.util.Scanner;

public class Day9 {
	public static void main(String[] args) {
		// wajp to read and write :
//		1. a variable by name age of byte data type
		// 2.a variable by name marks of short data type
		// 3.a variable by name population of int data type
		// 4.a variable by name country population of long datatype

		// program should accept dynamic input from user

		Scanner sc = new Scanner(System.in);

		System.out.println("user plese enter the age in byte");
		byte age = sc.nextByte();

		System.out.println("enter the marks in short");
		short s = sc.nextShort();

		System.out.println("enter population in int");
		int population = sc.nextInt();

		System.out.println("enter country population in long");
		long countryPop = sc.nextLong();

		sc.close();
		System.out.println(age + " " + s + " " + population + " " + countryPop);
	}

}
