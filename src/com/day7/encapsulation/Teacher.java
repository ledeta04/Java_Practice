package com.day7.encapsulation;

public class Teacher {
	
	// using Encapsulation get access to from another class
	

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setAge(17);  // Set...to write
		System.out.println(c.getAge()); //Get...to read
		
		c.setName("Kedru");
		System.out.println(c.getName());
		
//		c.setFee(2000); // Set removed from fee on Customer class so u can only read
		System.out.println(c.getFee());
		
		
		

	}

}
