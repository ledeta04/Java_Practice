package com.day10.exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// run time exception error, we use multiple catch for one try
		
		try { // we have to put them with in try key words
		
		Integer in = new Integer("ab");// Wrapper class is contains primitive datatype
		in.intValue();
		String name = null;
		int len = name.length();
		int[] arr = new int[5]; // index 0 - 4
		
		arr[5] = 10;
		}
		catch (Exception e) {  // parent of all catch 
		}
	// instead of writing multiple catch we can just use one time catch like above 
		
//		catch (ArrayIndexOutOfBoundsException e) {
//			
//		}
//		catch (NullPointerException e) {
//			
//		}
//		catch (NumberFormatException e) {
//			
//		}
		
		System.out.println("after exception");

	}

}
