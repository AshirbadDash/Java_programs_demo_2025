//package com.company.alphabets;
//
//public class PrintA {
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i == 1 || i == 3 || j == 1 || j == 5) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//
//}
package com.company.alphabets;

public class PrintA {
    public static void main(String[] args) {
        int n = 5; // Height of "A"

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == 3 && j > 1 && j < n) || (i == 1 && j > 1 && j < n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
