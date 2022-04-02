package com.day7.encapsulation;

//Encapsulation rules fields are always private and methods are public

public class Customer {
	
	private int age;  //instance variable or fields
	private String name;
	private double fee = 2500;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) { 
		if(age>18) {    // We can add restriction on Set like this
		this.age = age;}
		else {         // We can add restriction on Set like this
			this.age = 15; // We can add restriction on Set like this
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

//	public void setFee(double fee) {
//		this.fee = fee;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
