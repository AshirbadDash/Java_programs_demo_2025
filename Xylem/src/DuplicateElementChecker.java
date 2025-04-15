

import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

/**
 * This class handles the identification of duplicate elements in a String array.
 */
public class DuplicateElementChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        String[] inputArray = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextLine().trim();
        }

        printDuplicateElements(inputArray);

        scanner.close();
    }

    /**
     * Finds and prints duplicate elements in the given String array.
     * 
     * @param array The array of strings to check.
     */
    public static void printDuplicateElements(String[] array) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String value : array) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements found:");
            for (String duplicate : duplicates) {
                System.out.println("- " + duplicate);
            }
        }
    }
}
