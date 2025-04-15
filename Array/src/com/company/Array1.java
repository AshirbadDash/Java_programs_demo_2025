package com.company;

public class Array1 {
	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		int z = 3;

		int[] arr = { 1, 2, 3 };
		// collection of similar types of data is called as array

		// declaration of array
		int[] intArr;

		// initialize
		int[] a = new int[10];

		// array object of10 integers with default value
		// is stored in heap memory

		// in stack the reference a is stored with address to the first value
		System.out.println(a[0]);
		System.out.println(arr.length);
		// we can print all using loops
		for (int i = 0; i < arr.length; i++) {
			System.out.println(a[i]);
		}
		// length is a property not a method
		System.out.println(a);

		// [I@24d46ca6 [-->we are printing I -->it is of type integer 2732838-->hash
		// value to identify uniquely
		// for each loop works in collections and arrays

		for (int i : a) {
			System.out.print(a[i]);
		}

	}
}
