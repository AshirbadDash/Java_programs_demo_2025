package com.company;

public class Samosa {
	
	private static Samosa samosa;
	//constructor
	private Samosa() {
		
	}
	public static Samosa getSamosa() {
		
		if (samosa==null)
	     samosa = new Samosa();
		
		return samosa;
	}

}

/**
 * 1.constructor private
 * 
 * 
 * 
 * 
 */
