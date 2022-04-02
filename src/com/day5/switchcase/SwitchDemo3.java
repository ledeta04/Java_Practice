package com.day5.switchcase;

public class SwitchDemo3 {

	public enum vowel {a, e, i, o, u, w}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vowel[] characters = vowel.values();
		
		for(vowel now: characters) {
			
			switch(now){
				case a:
					System.out.println("it is vowel letter");
					break;
				case e:
					System.out.println("it is vowel letter");
					break;
				case i:
					System.out.println("it is vowel letter");
					break;
				case o:
					System.out.println("it is vowel letter");
					break;
				case u:
					System.out.println("it is vowel letter");
					break;
					default:
						System.out.println("it is consonant letter");
						break;
					
					
			}
			
		}

	}

}
