package com.company.learn_coding.overriding;

public class Demo1 {
	// A polymorphism which exists at the time of execution of program is called as
	// runtime polymorphism

//	example--method overriding

	/**
	 * whenever we writing method in super and sub classes in such a way that method
	 * name and parameter must be same called as method overriding
	 * 
	 * 
	 * method overriding cannot be performed without inheritance
	 * 
	 * method--> present in superclass --no --compile time error
	 * 
	 * -->yes--override or not
	 * 
	 * --if overriden it will call sub class method
	 * 
	 * --if not it will call superclass method
	 */

	class Shape {
		void draw() {
			System.out.println("Can't Say Shape Type");
		}
	}

	class Square extends Shape {
		@Override
		void draw() {
			super.draw(); // Calls the parent class draw() method
			System.out.println("Square Shape");
		}
	}

	public class Demo {
		public static void main(String[] args) {
			Shape r = new Square(); // Runtime Polymorphism
			r.draw();
		}
	}

}
