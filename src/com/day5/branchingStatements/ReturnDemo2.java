package com.day5.branchingStatements;

public class ReturnDemo2 {
	
	int Addition(int a, int b) {
		return a+b;
	}
	double Division(int a, int b) {
		return a/b;
	}
	String displayName(String name) {
		return name;
	}
	void showMethod() {
		   System.out.println("From show Method");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnDemo2 m1 = new ReturnDemo2(); //we have to create an Object
		
		System.out.println(m1.Addition(10, 10));
		m1.showMethod();  // no return its getting from itself
		System.out.println(m1.displayName("Ashenafi"));

	}

}
