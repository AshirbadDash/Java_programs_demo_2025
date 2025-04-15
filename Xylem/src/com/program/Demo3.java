package com.program;

import java.util.Arrays;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of 1st array ");
		int size = sc.nextInt();
		System.out.print("enter the size of 2nd array ");
		int size2 = sc.nextInt();
		int[] arr1 = new int[size];

		int[] arr2 = new int[size2];

		System.out.println("enter the values of 1st array........");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr1[i] = sc.nextInt();
		}

		System.out.println("enter the values of 2nd array........");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr2[i] = sc.nextInt();
		}
		if (!checkEquality(arr1, arr2)) {
			System.out.println(Arrays.toString(arr1) + " is not equal to " + Arrays.toString(arr2));
		} else {

			System.out.println(Arrays.toString(arr1) + " is  equal to " + Arrays.toString(arr2));
		}

		if (isEqual(arr1, arr2)) {

			System.out.println(Arrays.toString(arr1) + " is  equal to " + Arrays.toString(arr2));
		} else
			System.out.println(Arrays.toString(arr1) + " is not equal to " + Arrays.toString(arr2));

		sc.close();
	}

	public static boolean checkEquality(int[] arr1, int[] arr2) {
		if (Arrays.equals(arr1, arr2)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isEqual(int[] arr1, int[] arr2) {
		boolean flag = false;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
				} else {
					flag = true;
				}
			}
		}
		return flag;

	}

}
