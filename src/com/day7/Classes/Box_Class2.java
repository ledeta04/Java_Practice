package com.day7.Classes;

import com.day7.AccessModifiers.Box_Class3;

public class Box_Class2 {
	
	double width;
	double height;
	double depth;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double volume;
		Box_Class a = new Box_Class();
		Box_Class3 b = new Box_Class3();
		
		Box_Class2 c = new Box_Class2();
		
		c.width = 10;
		c.height = 20;
		c.depth = 30;
		
		volume = c.width * c.height * c.depth;
		System.out.println("Volume of box is: " + volume);
		
		Box_Class2 c2 = new Box_Class2(); // we can create multiple object
		
		c2.width = 85;
		c2.height = 55;
		c2.depth = 25;
		}

}
