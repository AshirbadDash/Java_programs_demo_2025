
package com.company.demo;

public class Shadowing {
	static int x;// this will be shadowed by line 0

	public static void main(String[] args) {
		System.out.println(x);
		int x = 40;
		int y = 20;

		int b = 20;
		String s = "12";
		int z = Integer.parseInt(s);
		System.out.println(z);
		int y1 = Integer.valueOf(z);
		char c = '1';
		int ch = Character.getNumericValue(c);
		System.out.println(ch);
		c = (char) b;
		System.out.println(c);

	}

}
