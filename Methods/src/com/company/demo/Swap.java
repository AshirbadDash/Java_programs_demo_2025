package com.company.demo;

public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a, b);
		String name = "ashirbad";
		Integer i = 10;
		changeName(name, i);
		System.out.println(name + " " + i);

	}

	private static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;

	}

	public static void changeName(String name, Integer i) {
		name = "ashirbad dash";
		i = 20;

	}

}
