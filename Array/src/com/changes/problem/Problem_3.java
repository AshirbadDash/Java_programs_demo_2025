package com.changes.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_3 {

	/**
	 * binary search
	 * 
	 * it requires sorted array
	 * 
	 * it works on divide and conquer
	 *
	 *
	 * Initialize: Set low = 0 and high = length of array - 1.
	 * 
	 * Find Middle: Compute mid = (low + high) / 2.
	 * 
	 * Compare:
	 * 
	 * If arr[mid] == target, return mid (found).
	 * 
	 * If arr[mid] < target, search in the right half (low = mid + 1).
	 * 
	 * If arr[mid] > target, search in the left half (high = mid - 1).
	 * 
	 * Repeat until low <= high.
	 */

	public static void main(String[] args) {
		System.out.println("User! please enter the size of the array");

		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);

		System.out.println("sorted array " + Arrays.toString(arr));
		int target = scan.nextInt();
		scan.close();
		int index = binary(arr, target);
		if (index != -1) {
			System.out.println("element found at index " + index);
		} else {
			System.out.println("element not found");
		}

	}

	public static int binary(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (target < arr[mid]) {
				high = mid - 1;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {

				return mid;
			}

		}
		return -1;

	}
}
