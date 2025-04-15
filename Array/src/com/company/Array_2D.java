package com.company;

public class Array_2D {
//array of arrays of different length
	// 2d arrays are called array of array it has both x and y
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 123;
		arr[0][1] = 123;
		arr[0][2] = 123;
		arr[1][0] = 123;
		arr[1][1] = 123;
		arr[1][2] = 123;
		arr[2][0] = 123;
		arr[2][1] = 123;
		arr[2][2] = 123;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int[][] Jagged_arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];

		arr[0][0] = 123;
		arr[0][1] = 123;
		arr[1][0] = 123;
		arr[1][1] = 123;
		arr[1][2] = 123;
		arr[2][0] = 123;
		arr[2][1] = 123;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
