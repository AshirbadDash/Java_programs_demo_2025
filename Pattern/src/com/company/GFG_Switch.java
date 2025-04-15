package com.company;

import java.util.Scanner;

public class GFG_Switch {
	public static void main(String[] args) {

		System.out.println("User! please enter the day number of week");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String day;

		switch (num) {
		case 1:
			day = "monday";
			break;
		case 2:
			day = "tuesday";
			break;
		case 3:
			day = "wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid day";
			System.out.println(day);
			System.exit(0);

		}
		System.out.println(day);
	}
}
