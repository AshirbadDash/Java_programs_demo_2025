package com.company;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("enter the  number");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		sc.close();
		isPrime(target);

	}

	public static void isPrime(int target) {
		boolean flag = false;
		if (target == 0 || target == 1) {
			flag = true;
		} else {
			for (int i = 2; i <= Math.sqrt(target); i++) {
				if (target % i == 0) {
					flag = true;
					break;
				}
			}
		}
		if (!flag) {
			System.out.println(target + " is prime number");
		} else {
			System.out.println(target + " is not a prime number");
		}

	}
}
