package com.day3;


class EmpInfo{
	String name = "Ashenafi Moges";
	static String city = "Lorton";
}

public class StaticVariableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Employee name: " + EmpInfo.name); // i will get error here cuz it's an instance variable
		//System.out.println("Employee city: " + EmpInfo.city);
		
		EmpInfo m1 = new EmpInfo();
		
		m1.name = "Kedru Bushra";
		m1.city = "Alexandria"; 
		
		System.out.println("Employee name: " + m1.name); // the instance works here after i create an Object for it
		System.out.println("Emplouee city: " + m1.city);
		
		
		System.out.println("\n");
		
		EmpInfo m2 = new EmpInfo();
		
		
		System.out.println("Employee name: " + m2.name);
		System.out.println("Emplouee city: " + m2.city);
		
		
	}

}
