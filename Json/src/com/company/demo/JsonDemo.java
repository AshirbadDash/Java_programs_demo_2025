package com.company.demo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JsonDemo {
	public static void main(String[] args) {

		/**
		 * JSON-javascript object notation.
		 * 
		 * JSON is a text format for storing and transporting data.
		 * 
		 * Easy to write and understand.
		 * 
		 * Language independent.
		 * 
		 * JSON supports--> Arrays Objects String Number
		 * 
		 * when two different applications written in 2 different language it uses JSON
		 * and then using library it is converted to java object and Python object.
		 * 
		 * it will be parsed and used.
		 * 
		 * 
		 */

		/**
		 * json Array more than one element can be stored maybe a list of object array
		 * 
		 * or array of strings,numbers ...
		 */

		/**
		 * JSON Object
		 * 
		 * JSON object holds key/value pair. each key is represented as a string in json
		 * and value can be of any type
		 * 
		 * 
		 */

		Student student1 = new Student("ashirbad", "12345678", "delhi", 394939L);
		Student student2 = new Student("durgesh", "12345678", "delhi", 394939L);

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);

		Gson gson = new Gson();
		String str = gson.toJson(student1);
		System.out.println(str);
		String str1 = gson.toJson(list);
		System.out.println(str1);
	}
}
