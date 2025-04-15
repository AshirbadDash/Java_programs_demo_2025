package com.company.demo;

public class Student {

	String name;
	String phone;
	String city;
	Long StudentId;

	public Student(String name, String phone, String city, Long studentId) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		StudentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getStudentId() {
		return StudentId;
	}

	public void setStudentId(Long studentId) {
		StudentId = studentId;
	}
	

}
