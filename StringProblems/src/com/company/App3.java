package com.company;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		System.out.println("user please enter the string");
		// print all the characters present in even index of string
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		for(int i=0;i<input.length();i++) {
			if(i%2==0) {
				System.out.print(input.charAt(i));
			}
		}

	}
}
