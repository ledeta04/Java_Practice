package com.day10.exception;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* even if there is exception error we can 
		still run our code...using finally */
		
		try { // we have to put them with in try key words
			
		Integer in = new Integer("ab");// Wrapper class is contains primitive datatype
		in.intValue();
		String name = null;
		int len = name.length();
		int[] arr = new int[5]; // index 0 - 4
		
		arr[5] = 10;
		}
//		catch (Exception e) {  // parent of all catch 
//		}
		finally {  // our code run because of this key word
			System.out.println("after exception");
		}

	}

}
