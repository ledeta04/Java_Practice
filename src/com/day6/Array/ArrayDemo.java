package com.day6.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ageOfStudent = new int[6]; // index from 0 --- 87
		
		//Storying values in Arrays
		
		ageOfStudent[0] = 30;
		ageOfStudent[1] = 31;
		ageOfStudent[2] = 32;
		ageOfStudent[3] = 20;
		ageOfStudent[4] = 21;
		ageOfStudent[5] = 26;
		
		
//		System.out.println(ageOfStudent[0]);
//		System.out.println(ageOfStudent[1]);
//		System.out.println(ageOfStudent[2]);
		
		// for eash statements
		
//		Syntax
//		for (datatype varName: arrayName) {
//			System.out.println(varName);
//		}
		
		
		for(int elt: ageOfStudent) {
			
			System.out.println(elt);
			
		}
		
		System.out.println("\n");
			
			//for loop to access array
			
			for(int i=0; i<6; i++) {
				
				System.out.println(ageOfStudent[i] + " ");
			}
			
			
		}

	}


