package com.company;

public class Samsung2 extends Samsung1 {

	void f3() {

		System.out.println("Child function 1 executed.");

	}

	Samsung2(int i, int j) {
		super(1, 2);
		System.out.println("Child constructor executed.");

	}

	/**
	 * if the data members of parent class are private we can do initialization of
	 * them using child's super().
	 */
}
