package com.changes.problem;

import java.util.Scanner;

public class Problems1 {

	// wap to input 10 values from the user and print them

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take size input from user
		System.out.println("User! please enter the size of the array");
		int size = sc.nextInt();

		// creating an integer array of specified size
		int[] arr = new int[size];

		// taking input from user
		System.out.println("User! please enter the elements of array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		// print the elements of array
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		// using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		// using while loop
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
		i = 0;
		// using do-while loop
		System.out.println();
		do {
			System.out.print(arr[i]+" ");

			i++;

		} while (i < arr.length);
		sc.close();
	}

}
