package com.company;

public class Method_Overloading {
	public static void add(int a) {
		System.out.println("The result is " + a);
	}

	public static void add(int a, int b) {
		System.out.println("the result is " + (a + b));

	}

	public static void add(double a, int b) {
		System.out.println("the result is " + (a + b));
	}

	public static void add(int a, double b) {
		System.out.println("the result is " + (a + b));
	}

	public static void main(String[] args) {

	}
}
