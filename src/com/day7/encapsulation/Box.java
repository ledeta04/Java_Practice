package com.day7.encapsulation;

public class Box {
	
	int width;
	int height;
	int depth;
	
	
	Box(){         // empty Constructor
		width = 10;
		height = 10;
		depth = 10;
	}
	Box(int w, int h, int d){  // parameter Constructor
		width = w;
		height = h;
		depth = d;
	}
	double volume() {
		double result = width * height * depth;
		return result;
	}
	void volume(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
		
		int volume = w+h+d;
		System.out.println(volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box();
		
		b.volume(10, 10, 10);
	
	}

}
