package com.company;

public class with_returntype_nopara {
	public static void main(String[] args) {
		int result=sub();
System.out.println(result);

	}

	static int sub() {
		int a = 10;
		int b = 5;
		int c = a - b;

		return c;
	}

}
