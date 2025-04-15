package com.company;

public class NewSwitch {

	/*
	 * @implNote before java 5 only int were supported in switch but after java 5
	 * strings are also supported in switch case
	 * 
	 * we can use -> instead of : and we also don't need break
	 * 
	 * switch (day) case "Saturday", "Sunday" -> case "Monday" -> "8am"; default ->
	 * "7am" ; "6am" ;
	 * 
	 * if we want to use : we need to use yield instead of break and ->
	 */
	
	public static void main(String[] args) {

		String day = "Thursday";

		switch (day) {
		case "Saturday", "Sunday":
			System.out.println("wake up at 6am");
			break;
		case "Monday", "Thursday":
			System.out.println("wake up at 9am");
			break;

		default:
			System.out.println("invalid input");
		}
	}

}
