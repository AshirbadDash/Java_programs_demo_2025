package com.arrays.changes;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

//	arrays-->collection of similar kind of values homogeneous elements

		// we can store multiple values into a single variable
		// it has a fixed size
		

		// values are of similar types
		// if size of array is n, the index will be from 0 -> n-1.

		// memory locations are continuous in linear way

		// we cannot change size on runtime

		// how array is created in java
		int[] a = new int[size];

		String[] s = new String[size];
		// we can input or access any element of array using index
		a[0] = 10;

	}

}
