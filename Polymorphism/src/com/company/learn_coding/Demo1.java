package com.company.learn_coding;

public class Demo1 {
	/**
	 * polymorphism is a Greek word whose meaning is same object having different
	 * behavior.
	 * 
	 * poly=many morphism=forms
	 * 
	 * person can be friend teacher customer student
	 * 
	 * void person(Teacher)
	 * 
	 * void person(Student)
	 * 
	 * void person(Friend)
	 * 
	 * void person(Customer)
	 * 
	 */

	/**
	 * polymorphism are of 2 types(can be achieved in 2 ways)
	 * 
	 * 1.compile time polymorphism(static polymorphism or early binding)
	 * 
	 * 2.Runtime polymorphism(dynamic polymorphism or late binding)
	 */

	// compile time polymorphism

	/**
	 * whenever a class contains more than one methods with same name and different
	 * types of parameters is called as method overloading
	 * 
	 * return-type method-name(para1);
	 * 
	 * return-type method-name(para1,para2);
	 * 
	 * there is no restriction on return type
	 */

	public static void main(String[] args) {
		MathOperations obj = new MathOperations();

		System.out.println(obj.add(5, 10)); // Calls add(int, int) → Output: 15
		System.out.println(obj.add(5, 10, 15)); // Calls add(int, int, int) → Output: 30
		System.out.println(obj.add(5.5, 2.2)); // Calls add(double, double) → Output: 7.7
		System.out.println(obj.add("Number: ", 100)); // Calls add(String, int) → Output: Number: 100
	}
}
