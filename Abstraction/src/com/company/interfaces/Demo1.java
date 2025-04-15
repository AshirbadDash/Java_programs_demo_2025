package com.company.interfaces;

public interface Demo1 {

	int x = 2;

	// by default the data members are public static and final
	// once data is assigned it cannot be changed

	void f1();
	// by default the function of interface is public and abstract
	// if we make the function static we can define its body

	// using interface if we want to create another interface we can use extends but
	// if we are using in class we use implements

	/**
	 * we can implement two interface multiple inheritance it is achievable because
	 * we have to override the function as they are abstract public
	 */

	/**
	 * interface does not have constructor as the variables are public static and
	 * final --we need to assign immediately
	 * 
	 * and also the child will call the super class not the super interface
	 * 
	 */

	/**
	 * static functions are not inherited or extended
	 * 
	 * variables are also static in interface ,so variables can be override and
	 * inherited too
	 */
}
