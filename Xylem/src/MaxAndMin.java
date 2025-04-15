import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("element " + (i + 1) + ": ");

			arr[i] = sc.nextInt();

		}
		findMax(arr);
		int min = arr[0];
		int max_ele = findMax(arr);
		int min_ele = findMin(arr);
		System.out.println("In " + Arrays.toString(arr) + " the max element is " + max_ele + " and the min element is "
				+ min_ele);
		sc.close();
	}

	public static int findMax(int[] arr) {
		int max = arr[1];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
