package com.changes.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {

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

		System.out.println("Enter the position to delete (1-based index):");
		int pos = sc.nextInt();

		int[] newArr = deleteElement(arr, pos);

		System.out.println("New array: " + Arrays.toString(newArr));

		sc.close();
	}

	public static int[] deleteElement(int[] arr, int pos) {
		if (pos < 1 || pos > arr.length) {
			throw new IllegalArgumentException("Invalid position!");
		}

		int[] newArr = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i != pos - 1) {
				newArr[j++] = arr[i]; // Copy elements except the deleted one
			}
		}

		return newArr;
	}
}
