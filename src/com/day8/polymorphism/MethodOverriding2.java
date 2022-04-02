package com.day8.polymorphism;

class A{
	
	int i, j;
	A(int a, int b){
		
		i = a;
		j = b;
	}
	void show() {
		System.out.println(i + " " + j);
	}
}
class B extends A{
	
	int k;
	B(int a, int b, int c){
		super(a , b);
		k = c;
	}
	void show() {
		System.out.println(k);
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B call = new B(10, 10, 20);
		call.show();
		
		
		

	}

}
