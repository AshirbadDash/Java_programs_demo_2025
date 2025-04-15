package com.company;

abstract class Demo {

	/**
	 * if we don't want to create object of any class we use abstract keyword
	 * 
	 * the variables and functions of this class will be used by creating child
	 * 
	 * 
	 * 
	 * #does abstract class have constructor
	 * 
	 * yes it has constructor,as when child object is created it will use super to
	 * call parent constructor
	 * 
	 * 
	 */

	/*
	 * we can also create extract function using extract keyword which will have no
	 * method body
	 * 
	 * if any class have even a single abstract function we have to make the whole
	 * class abstract
	 * 
	 * then we cannot create the object of the child as the abstract function is
	 * also passed from parent
	 * 
	 * we can override the function in the child class so that we can create the
	 * child object as the abstract function will be hidden
	 */
	abstract void f1();

	Demo() {
		System.out.println("parent constructor");
	}
	/**
	 * can we make constructor private
	 * 
	 * to restrict user to create object of that class we use private constructor
	 */

	/**
	 * can main method be overloaded
	 */

	/**
	 * use of abstract class
	 * 
	 * bank-abstract class have abstract function void roi();
	 * 
	 * if any method want to create class extending bank then he has to give the
	 * implementation of the abstract method overriding it implementation of the
	 * 
	 */
}
