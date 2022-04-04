package com.day12.Pojo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomerStoring_in_HashMap {

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
		
	//create HashMap using class name Customer
	// this is key and value
	// to insert data we use put key word
	// we put Object name on value	
		HashMap h = new HashMap();
		
		h.put(1, c);
		h.put(2, c1);
		
	// convert the HashMap to Set
		Set s = h.entrySet();
		
		Iterator i = s.iterator();
		
	while(i.hasNext()) {
			Map.Entry m =(Map.Entry)i.next();
//we create this additional code on Map to get the value		
			Customer cust = (Customer)m.getValue();
			
			System.out.println(m.getKey()+ " " + cust.getName()+" " + cust.getAge());
		}

	}

}
