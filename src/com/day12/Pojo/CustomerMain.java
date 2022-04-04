package com.day12.Pojo;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer();
		
		c.setAge(25);
		c.setName("Ashenafi");
		c.setSalary(160000);
		
		System.out.println(c.getAge());
		System.out.println(c.getName());
		System.out.println(c.getSalary());
		
		// if we have additional Object
		Customer c1 = new Customer();
		
		c1.setAge(35);
		c1.setName("John");
		c1.setSalary(150000);
		
		System.out.println(c1.getAge()+ " "+c1.getName()+ " "+c1.getSalary());
		
		
		

	}

}
