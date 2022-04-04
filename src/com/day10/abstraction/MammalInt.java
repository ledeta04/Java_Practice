package com.day10.abstraction;

public class MammalInt implements Animal, Dog{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Animal eats");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels");
		
	}
	public int noOfLegs() {
		return 0;
	}
	
	public static void main(String[]args) {
		
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

}
