package com.company.striver;

import java.util.Scanner;

public class ArmstrongN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User, please enter a number to check for Armstrong:");
        int number = sc.nextInt();
        sc.close();

        boolean result = armstrong_number(number);

        if (result) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }

    static boolean armstrong_number(int num) {
        int original = num;
        int sum = 0, digits = 0;
        
        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Reset temp to original number
        temp = num;

        // Calculate the sum of digits raised to the power of 'digits'
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        // Check if sum matches original number
        return sum == original;
    }
}
