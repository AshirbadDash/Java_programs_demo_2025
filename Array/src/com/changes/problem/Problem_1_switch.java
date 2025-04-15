package com.changes.problem;

import java.util.Scanner;


public class Problem_1_switch {
	public static void main(String[] args) {
		System.out.println("User! please enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// creation of array
		int[] arr = new int[size];
		// take input from user
		System.out.println("User! please enter the elements  of the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			forLoop(arr);
			break;
		case 2:
			forEachLoop(arr);
			break;
		case 3:
			whileLoop(arr);
			break;
		case 4:
			doWhileLoop(arr);
			break;
		default:
			System.out.println("Invalid choice.please enter 1-4");

		}
		sc.close();

	}
/**
 * 
 * @param arr
 */
	public static void forLoop(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void forEachLoop(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele);
		}

	}

	public static void whileLoop(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}

	}

	public static void doWhileLoop(int[] arr) {
		int i = 0;
		do {
			System.out.println(arr[i]);
			i++;
		} while (i < arr.length);
	}

}
