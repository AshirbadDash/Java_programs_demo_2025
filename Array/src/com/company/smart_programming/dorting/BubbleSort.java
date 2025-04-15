package com.company.smart_programming.dorting;

public class BubbleSort {

	/**
	 * Bubble sort also referred to as sinking sort, is a comparison based algorithm
	 * i.e comparing each pair of adjacent items and swapping them if they are in
	 * the wrong order the pass through the list is repeated until no swapping
	 * needed , which indicated that the list is sorted .
	 * 
	 * round-1 ex:36 19 29 12 5
	 * 
	 * sort:19 36 29 12 5
	 * 
	 * 19 29 36 12 5
	 * 
	 * 19 29 12 36 5
	 * 
	 * 19 29 12 5 36
	 * 
	 * round-2 19 29 12 5 36
	 * 
	 * 19 29 12 5 36
	 * 
	 * 19 12 29 5 36
	 * 
	 * 19 12 5 29 36
	 * 
	 * 
	 * round-3
	 * 
	 * 19 12 5 29 36
	 * 
	 * 12 19 5 29 36
	 * 
	 * 12 5 19 29 36
	 * 
	 * round-4
	 * 
	 * 5 12 19 29 36 --->sorting is done in each round largest element is placed
	 * 
	 * no of rounds =no of elements in the list -1
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] a = { 36, 19, 29, 12, 5 };
		int temp;
		int length = a.length;
		System.out.print("unsorted array :");
		for (int ele : a) {
			System.out.print(ele+" ");
		}
		System.out.println();

		for (int i = 0; i <= length - 1; i++) {
			int flag = 0;

			for (int j = 0; j < length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					
					//in case of string array we use a[j].compareTo(a[j+1])>0)
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println("sorted array :");
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
