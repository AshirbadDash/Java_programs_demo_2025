import java.util.Scanner;

public class Demo_02 {
	public static void main(String[] args) {

		// 2d array creation
		int[][] a;

		// taking size as input from user
		System.out.println("enter the row and col size");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		// declaration
		a = new int[row][col];

		// initialization
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[1][0] = 3;
//		a[1][1] = 4;

		System.out.println("enter the elements");
		// input using loop
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();

//				sc.close();
			}
		}

		// for loop
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}

//		// for each loop
//		for (int[] arr : a) {
//			for (int ele : arr) {
//				System.err.println(ele);
//
//			}
//
//		}

		// while loop
//		int i = 0, j = 0;
//		while (i < a.length) {
//			j = 0;
//			while (j < a[i].length) {
//				System.out.println(a[i][j] + " ");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		//do while loop
		
		int row1 = 0;
        int col1;

		
        do {
            col1 = 0;
            do {
                System.out.print(a[row1][col1] + " ");
                col1++;
            } while (col1 < a[row1].length);

            System.out.println(); // Move to the next row
            row1++;
        } while (row1 < a.length);
    }

	}
	

