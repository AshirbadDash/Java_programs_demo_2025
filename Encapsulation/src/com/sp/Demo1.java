package com.sp;

public class Demo1 {

	/**
	 * encapsulation is like capsule everything is binded inside that
	 * 
	 * car engine is properly binded and not visible to user
	 * 
	 * Encapsulation in java is mechanism of wrapping the data variables and code
	 * acting on the data (methods) together as a single unit
	 * 
	 * 
	 * we can achieve encapsulation by
	 * 
	 * 1.Declare the variables of a class as private
	 *
	 * 2.Provide public setter and getter methods to modify and view the variable
	 * values.
	 *
	 */

	private int empId;// data hiding

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * data hiding
	 * 
	 * controlled access
	 * 
	 * increased security
	 * 
	 * improve maintainability
	 */
}
