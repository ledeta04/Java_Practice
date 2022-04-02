package com.day8.StaticVariableDemo;

public class StaticClass {
	
	static int height = 34;
	static int weight = 70;
	int size = 30;
	
	public static void Details() {
		System.out.println("Height of person " + height);
		System.out.println("Weight of person: " + weight);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticClass.Details();
		
		StaticClass.weight = 85; // static value will not change here
		
		StaticClass s = new StaticClass();
		
		s.size = 35; // instance value will change here
		
		System.out.println(s.size);
		

	}

}
