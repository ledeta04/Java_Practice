package com.day6.Array;

public class ArrayDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age[] = {12,25,24,58,45,69};
		int sum = 0;
		
		for (int a: age) {
			sum = a+sum;
		}
		System.out.println(sum);

	}

}
