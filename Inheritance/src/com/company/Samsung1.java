package com.company;

public class Samsung1 {
	private int x, y;

	void f1() {
		System.out.println("Parent function 1 executed.");

	}

	void f2() {
		System.out.println("Parent function 2 executed.");

	}

	Samsung1() {
		System.out.println("Parent Constructor executed.");

	}

	public Samsung1(int i, int j) {

		this.x = i;

		this.y = j;
		System.out.println(x + y);
	}
	/**
	 * this refer to the current object(who ever is calling the function )
	 * 
	 * IF WE WANT TO STORE IN PARENTS X,Y WE NEED TO USE SUPER KEYWORD super.x
	 * super.y
	 * 
	 * 
	 */

	/**
	 * when one member comes to another class and it has same method then whoever
	 * object is created then object will run it is known as method overriding
	 * 
	 */

	/**
	 * every function has super and this keyword
	 */

}
