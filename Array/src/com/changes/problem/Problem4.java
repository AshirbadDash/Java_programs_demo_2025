package com.changes.problem;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {

		/**
		 * operations on array
		 *
		 * searching
		 *
		 * linear search
		 *
		 * binary search
		 *
		 * sorting
		 */

		/**
		 * linear search
		 * 
		 */
		System.out.println("Enter the element to search");
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();

		int[] arr = { 1, 2, 4, 6, 7 };
		int index = indexAt(arr, target);

		if (index != -1) {
			System.out.println("element found at index " + index);

		} else {
			System.out.println("element not found");
		}
	}

	public static int indexAt(int[] arr, int target) {
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				index = i;
				break;
			}
		}
		return index;

	}

}
