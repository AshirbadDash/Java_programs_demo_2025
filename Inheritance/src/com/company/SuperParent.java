package com.company;

public class SuperParent {
	int x;
	int y;

	void f1(int x, int y) {
		this.x = x;
		this.y = y;

	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

}
