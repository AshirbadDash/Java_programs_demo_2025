package com.company;

public class with_returntype_para {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int sum=add(a, b);
		System.out.println(sum);
	}

	static int add(int a, int b) {
		int c = a + b;
		return c;

	}

}
