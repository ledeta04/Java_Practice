package com.day8.polymorphism;

public class BoxMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxDemo b = new BoxDemo();
		
		System.out.println(b.volume());
		
		BoxDemo b1 = new BoxDemo(5,10,15);
		
		System.out.println(b1.volume());
		
		
	}

}
