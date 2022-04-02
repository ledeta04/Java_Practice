package com.day5.branchingStatements;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k=25; k<=31; k++) {
			new ReturnDemo().checkEven(k);
			// we can use system print instead of object creating if we want console to give us true or false
		//System.out.println(new ReturnDemo().checkEven(k));	
			}
		}
	public boolean checkEven(int a) {
		if(a%2==0) {
			System.out.println(a + " is even number");
			return true;
		}
		System.out.println(a + " is odd number");
		return false;
	}
}
	
			
			
			
			
			
			
			
	




