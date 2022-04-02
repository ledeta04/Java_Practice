package com.day8.inheritancedemo;

class OuterClass{ //we can not use Private for outer class
	
	int x = 10;
	class InnerClass{ //Inner class we can use private or static 
		
		int y = 20;
	}
}



public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass m1 = new OuterClass();
		
		OuterClass.InnerClass m2 = m1.new InnerClass();
		
		System.out.println("Outer: " + m1.x + " Inner: " + m2.y);
	}
}

