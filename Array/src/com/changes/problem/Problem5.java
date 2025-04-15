package com.changes.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Element at " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Current array: " + Arrays.toString(arr));

		System.out.println("Enter the position to insert the element:");
		int pos = sc.nextInt();

		System.out.println("Enter the element to insert:");
		int ele = sc.nextInt();

		int[] newArr = insert(arr, ele, pos);

		System.out.println("New array: " + Arrays.toString(newArr));

		sc.close();
	}

	public static int[] insert(int[] arr, int ele, int pos) {
		// Validate position
		if (pos < 1 || pos > arr.length + 1) {
			throw new IllegalArgumentException("Invalid position!");
		}

		// Create a new array with +1 size
		int[] newArr = new int[arr.length + 1];

		// Copy elements before insertion position
		for (int i = 0; i < pos - 1; i++) {
			newArr[i] = arr[i];
		}

		// Insert the new element at the specified position
		newArr[pos - 1] = ele;

		// Copy the remaining elements after insertion
		for (int i = pos - 1; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		return newArr;
	}
}

//
//
//
//package com.changes.problem;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Problem5 {
//	/**
//	 * to insert an element in a specific position into an array is called as
//	 * insertion
//	 */
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the position to insert the element");
//		int pos = sc.nextInt();
//
//		System.out.println("enter the element to insert");
//		int ele = sc.nextInt();
//
//		System.out.println("enter the size of the array");
//		int size = sc.nextInt();
//
//		int[] arr = new int[size];
//
//		System.out.println("enter the elements of the array to insert");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("Element at " + (i + 1) + ": ");
//			arr[i] = sc.nextInt();
//
//		}
//		System.out.println("current array: " + Arrays.toString(arr));
//		insert(arr, ele, pos, size);
//	}
//
//	public static void insert(int[] arr, int ele, int pos, int size) {
//		// create a new array with +1 size
//
//		int[] newArr = new int[size + 1];
//		for (int i = 0; i < pos - 1; i++) {
//			newArr[i] = arr[i];
//
//		}
//		newArr[pos - 1] = ele;
//		System.out.println(Arrays.toString(newArr));
//		for (int i = pos; i < newArr.length; i++) {
//			newArr[i + 1] = arr[i];
//		}
//		System.out.println("new array " + Arrays.toString(newArr));
//
//	}
//}
