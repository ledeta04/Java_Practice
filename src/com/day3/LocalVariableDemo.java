package com.day3;

public class LocalVariableDemo {
	
	// int age; // instance variable
	
	public void methodone() {
	//	age = 25; // instance variable can be access in d/f method within the same local class
		int j = 25; // <---------- local variable
		System.out.println("Value of j:" + j); // 25
	
	}
	public void methodtwo() {
	//	age = 28; // instance variable can be access in d/f method within the same local class
		int k = 30; // <---------- local variable
		int j = 24; // create new Local variable
		System.out.println("Value of k:" + k); // 30
//      System.out.println("Value of j:" + j);// ← Error its outside of this method or need to create new local variable
		System.out.println("Value of j:" + j); // 24
		
	}

	public void methodthree() {
	//	age = 30; // instance variable can be access in d/f method within the same local class
		int k = 35;
		int j = 33;
		System.out.println("Value of k:" + k);
	    System.out.println("Value of j:" + j);
	}	
		// we need a main method always in order to run
	    public static void main(String[] args) {
	    
	    	// next We create an Object using a class name 
	    	
	    	//m1 is reference variable we can use anything
	    	LocalVariableDemo m1 = new LocalVariableDemo(); 
	    	
	    	
	    	//Call the methods inside the class
	    	m1.methodone();
	        m1.methodtwo();
	        m1.methodthree();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
		
	}


