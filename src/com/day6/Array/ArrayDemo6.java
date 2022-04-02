package com.day6.Array;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we can use for each loop for the same Array
		
		String name1[] = {"Henok","Betty","Hewan","Mohammod"};
		
				for(String e: name1) { // e will iterate on name1
					
					System.out.println(e);
				}

		int age[] = {23,67,88,12,99,66};
		
		for(int a: age) { // a will iterate on age
			
			System.out.println(a);
		}
		
		String employeeName [] = {"John","David","Delonte","Francis","Scott"};

		for(String em: employeeName) {
			
			System.out.println(em);
		}
	}

}
