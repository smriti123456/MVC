package com.models;

public class Customer {
	
	
	private String name;
	private int age;
	private int aadhar;
	
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public int getAadhar() {
		return aadhar;
	}
	
	
	public Customer(String name, int age, int aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}
	
	
}
