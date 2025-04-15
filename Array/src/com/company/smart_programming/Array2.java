package com.company.smart_programming;

public class Array2 {
	/*
	 * types of arrays
	 * 
	 * ## Single-dimensional -->1d array (single row or column)
	 * 
	 * ## Multi-dimensional (array of arrays) -->2D and 3D
	 * 
	 */

	/*
	 * ---------------------1D ARRAY-----------------------
	 * 
	 */
	public static void main(String[] args) {

		/*
		 * ---------------------DECLARATION-----------------------
		 * 
		 */
int[] a;
		/**
		 * - This is the preferred way as the name is separated by the type of array. -
		 * We should not declare the size during declaration.
		 * 
		 * Example: int[] c, d;
		 * 
		 * // Both are arrays int x[], y;
		 * 
		 * // x is an array, but y is a simple int variable.
		 */
		/*
		 * ---------------------CREATION-----------------------
		 * 
		 */

		a = new int[3];
		// declare the size at the time of creation

		// we can do declaration and creation in single line
		int[] arr = new int[3];

		/**
		 * - We can provide the size of an array as 0; it will compile and run.
		 * 
		 * - If we provide a negative size, it will compile but throw an exception at
		 * runtime (NegativeArraySizeException).
		 * 
		 * - When we create an array, the default values will be initialized as per the
		 * type of array.
		 */

		/*
		 * initialization
		 * 
		 * when we initialize then the default value will be replaced if
		 * 
		 * we don't initialize then default value will remain
		 * 
		 * if we want to insert value more than size then it will throw exception
		 * [ArrayIndexOutOfBoundException]
		 * 
		 */

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		/*
		 * we can do declaration,creation and initialization in single line
		 * 
		 * we don't need to provide size it will automatically take the size
		 * 
		 * by default value is not provided as directly values will be inserted
		 */

		int[] b = { 10, 30, 40 };

		/**
		 * -RETRIEVE
		 * 
		 */
		/*
		 * using for loop and for each loop
		 */
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		for(int ele:b) {
			System.out.println(ele);
		}

	}
}
