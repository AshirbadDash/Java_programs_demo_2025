package com.company.demo;

public class PassingExample {

	public static void main(String[] args) {
		String name = "Ashirbad";
		greet(name);
		System.out.println(name);

	}

	static void greet(String name) {
		name = "ashirbad dash";
		System.out.println(name);
	}

}
