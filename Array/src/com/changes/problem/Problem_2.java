package com.changes.problem;

import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int elements = input.nextInt();

		int[] array = new int[elements];

		for (int i = 0; i < elements; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}

		int[] minMax = findMinMax(array);

		System.out.println("The maximum number is " + minMax[1]+" at pos "+minMax[2]);
		System.out.println("The minimum number is " + minMax[0]+" at pos "+minMax[3]);
	}

	public static int[] findMinMax(int[] array) {
		int max = array[0];
		int min = array[0];
		int pos_min = 0;
		int pos_max = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				pos_min = i;
			}
			if (array[i] < min) {
				min = array[i];
				pos_max = i;
			}

		}
		return new int[] { min, max, pos_min, pos_max };
	}
}
