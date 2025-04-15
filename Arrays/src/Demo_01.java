import java.util.Scanner;

public class Demo_01 {
	public static void main(String[] args) {
		// 1d array creation
//		taking the size as input
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a;
		// declaration
		a = new int[size];	
		// initialization
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;		
//		a[4] = 50;

		// taking input using for loop
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int i = 0;
		while (i < a.length) {
			a[i] = sc.nextInt();

		}

		// creation declaration and initialization all
		int[] b = { 1, 2, 3, 4, 5, 6 };
		// printing the element of elements of 1d array using for loop
		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.println(a[i1]);
		}
		// using for each loop
		for (int ele : a) {
			System.out.println(a);
		}
		// using while loop
		int j = 0;
		while (i < a.length) {
			System.out.println(a[i]);
			i++;
		}
		// using doWhile loop

		do {
			System.out.println(a[i]);
			i++;
		} while (i < a.length);
	}

}