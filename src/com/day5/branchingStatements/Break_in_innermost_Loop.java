package com.day5.branchingStatements;

public class Break_in_innermost_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=2; i++) {
			
			for(int j=0; j<=3; j++) {
				
				if(j==2)
					break;
				System.out.println(j);
				
				}
			
			}
		}
	}
