package com.company.alphabets;

public class PrintG {
    public static void main(String[] args) {
        int n = 5; // Size of "G"

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || // Left vertical bar
                    (i == 1 && j < n) || // Top horizontal bar
                    (i == n && j < n) || // Bottom horizontal bar
                    (j == n && i >= n / 2) || // Right vertical bar (only in lower half)
                    (i == n / 2 && j >= n / 2)) { // Middle bar of "G"
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after row is printed
        }
    }
}
