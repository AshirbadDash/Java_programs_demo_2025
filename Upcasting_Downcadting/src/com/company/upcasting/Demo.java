package com.company.upcasting;

public class Demo {
	public static void main(String[] args) {

		/**
		 * upcasing is casting a subtype to a supertype upward to the inheritance tree.
		 * upcasting happens automatically and we dont have to explicitly do anything
		 * 
		 * 
		 * upcasting is only possible to reference methods of the child class which are
		 * already there in parent class
		 */

		// when there is parent class animal and there are multiple child classes
		// animals cat dog etc ..
		// every child has unique method and common method we can address or call the
		// common method of child classes using parent we use upcasting

		/**
		 * when subclass type refers to the object of parent class it is known as
		 * downCasting.
		 * 
		 * if we perform it directly compiler gives compilation error.if you perform by
		 * typecasting classCastException is thrown at runtime.but if we use instanceOf
		 * operator downcasting is possible
		 */

		// and to call the unique methods of each child class we use downcasting

	}

}
