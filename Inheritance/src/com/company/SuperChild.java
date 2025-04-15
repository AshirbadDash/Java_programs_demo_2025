package com.company;

public class SuperChild extends SuperParent {
	int x, y;

	void f2(int x, int y) {
		super.x = x;
		super.y = y;

	}

	void f3() {
		System.out.println(super.x);
		System.out.println(super.y);
		display();
	}

}
