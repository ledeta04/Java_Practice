package com.day12.Pojo;

// No extend or inherit on POJO Class
// the variable is private and method is public
// use getter and setter Encapsulation
// No annotation
public class Customer {
	
	private int age;
	private String name;
	private double salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
