package com.company;

/**
 * 
 */
public class Demo1 {
	/**
	 * 
	 */

	int x, y;

	void f1() {
//		x = 5;
//		y = 9;

	}

	void f2() {

	}

	Demo1() {
		System.out.println("hello");
		x = 5;
		y = 9;
		// it works without calling when object is created
		// to initialize values inside object it is automatically called on object
		// creation

		// it is created on its own default constructor only if we don't create
		// if we create parameterized constructor then we have to create empty
		// constructor too

	}

	/**
	 * Default constructor(compiler)
	 * 
	 * No-args constructor(user)
	 * 
	 * parameterized constructor(user)
	 */

}
