import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// sum of n numbers
		// sum=n*n+1/2;
		int missingNumber = findMissing(arr);
		System.out.println(missingNumber);
		sc.close();
	}

	public static int findMissing(int[] arr) {
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int ele : arr) {
			actualSum += ele;
		}
		return expectedSum - actualSum;
	}

	public static void expectedNumber(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println("sum of the elements of the array " + sum);
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += sum2 + i;
		}
		System.out.println("sum of range of elements in array " + sum2);

		int missingNumber = sum2 - sum;
		System.out.println(missingNumber);
	}

}
