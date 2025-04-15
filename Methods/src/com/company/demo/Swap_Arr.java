/*package com.company.demo;

public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int[] swapped = swap(a, b);
		a = swapped[0];
		b = swapped[1];

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	private static int[] swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

		return new int[]{a, b};
	}
}
*/
package com.company.demo;

public class Swap_Arr {
	public static void main(String[] args) {
		int[] values = { 10, 20 };

		swap(values); // modifies values in place

		System.out.println("a = " + values[0]);
		System.out.println("b = " + values[1]);
	}

	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
}
