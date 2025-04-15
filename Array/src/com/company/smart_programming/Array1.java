package com.company.smart_programming;

/**
 * The  Array1 class demonstrates basic concepts of arrays in Java.
 * 
 * An array is a data structure used to store multiple values of the same data type.
 * Arrays are objects in Java, and their superclass is {@code Object}.
 * 
 * Characteristics of arrays in Java:
 * - Arrays store homogeneous (similar) data types.
 * - They use heap memory since all objects in Java are stored in the heap.
 * - They are created at runtime.
 * - The size of an array is fixed upon creation and cannot be changed dynamically.
 * - Removing an element requires shifting, which reduces performance.
 * - Arrays can store primitive types as well as objects.
 * 
 * Performance Consideration: Arrays are generally faster compared to wrapper class objects
 * since primitive types do not require autoboxing.
 */
public class Array1 {
    /**
     * Array to store employee IDs. The size is fixed at 100 elements.
     */
    int[] emp_id = new int[100]; // Example: {101, 102, 103, ...}
}