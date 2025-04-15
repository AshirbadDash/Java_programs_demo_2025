package com.company;

public class Array2 {
	public static void main(String[] args) {

		find_number();
		Max_value();
		reverse_array();
		sum();
	}

	static void find_number() {
		int[] arr = { 1, 2, 3, 4, 5, 67 };
		for (int ele : arr) {
			if (ele == 67) {
				System.out.println("found");
			}
		}

	}

	//
	static void Max_value() {

		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 12;
		arr[2] = 4322;
		arr[3] = -22;
		arr[4] = 32;

		int res = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res) {
				res = arr[i];

			}
		}
		System.out.println(res);

	}

	static void reverse_array() {

		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 12;
		arr[2] = 4322;
		arr[3] = -22;
		arr[4] = 32;
//length is  5 but index start from 0 
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	static void sum() {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 12;
		arr[2] = 4322;
		arr[3] = -22;
		arr[4] = 32;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println(sum);
	}
}
