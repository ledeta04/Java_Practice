package com.day7.Constructors;

public class Candidate {
	
	/*Constructors don't have return type
	and can use access modifier and 
	the name has to be the same with class */
	
	int age;
	int salary;
	
	public Candidate(int age, int salary) {
		this.age = age; // this represent the instance variable in class
		this.salary = salary;
	}
	
	public Candidate(int age) {
		this.age = age;
	}
//	public Candidate() { // behind the scene there is default constructor like this
//		with out parameter but when i put parameter on Object 
//	    the error will go away
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidate c = new Candidate(25,7000); 
		
		System.out.println(c.age);
		
		Candidate d = new Candidate(23);
		System.out.println(d.age);
		System.out.println(d.salary); // No Constructor for this so no print

	}

}
