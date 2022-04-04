package com.day12.Pojo;

import java.util.ArrayList;

public class CustomerStoring_in_ArrayList {

	public static void main(String[] args) {
		
// Storing and displaying objects in ArrayList	
		
		Customer c = new Customer();
		
		c.setAge(25);
		c.setName("Ashenafi");
		c.setSalary(160000);
		
		Customer c1 = new Customer();
		
		c1.setAge(35);
		c1.setName("John");
		c1.setSalary(150000);
	
	//create ArrayList using class name Customer
		ArrayList<Customer> a = new ArrayList();
		
		a.add(c);
		a.add(c1);
		
		for(Customer cu: a) {
			System.out.println(cu.getAge());
			System.out.println(cu.getName());
			System.out.println(cu.getSalary());
		}
		

	}

}
