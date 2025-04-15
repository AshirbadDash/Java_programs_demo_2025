package com.company.demo;

import java.util.function.Predicate;

public class Demo1 {
	public static void main(String[] args) {

		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(20));
		System.out.println(p.test(9));

		Predicate<String>s=j->(j.length()>4);
		System.out.println(s.test("hello"));
		System.out.println(s.test("java"));
		
		//print array elements whose size is >4 from array
		String[] name= {"david","Scott","John","Mary"};
		
		
		
		
	}

}
