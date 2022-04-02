package com.day8.polymorphism;

	// Final Key words (class, method, variable)

public class FinalKeyWords {
	
	final String color = "Black";
	final double salary = 160000;
	int age = 35;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyWords f = new FinalKeyWords();
		
	//	f.color = "Red"; // if i use Final key word i can not change it here
		
		f.age = 29;
		System.out.println(f.salary);
		System.out.println(f.age);
	}

}
