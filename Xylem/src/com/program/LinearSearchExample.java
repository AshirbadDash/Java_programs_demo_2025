package com.program;
import java.util.Scanner;

public class LinearSearchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = Integer.parseInt(scanner.nextLine());

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextLine().trim();
        }

        System.out.print("Enter element to search: ");
        String target = scanner.nextLine().trim();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element '" + target + "' found at index " + index);
        } else {
            System.out.println("Element '" + target + "' not found.");
        }

        scanner.close();
    }

    /**
     * Performs a linear search on the array.
     *
     * @param arr    The array to search.
     * @param target The value to search for.
     * @return The index of the target, or -1 if not found.
     */
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
