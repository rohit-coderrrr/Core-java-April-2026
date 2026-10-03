package com.java.core.conditionalstatement;

public class nestedifcondition {
	
	public static void main(String[] args) {
	
	int a = 12;
	
	//condition-> if number is divisible by 2 and 3 then is a good number
	
	if (a % 2 == 0) {
		System.out.println("number is divisible by 2");
	
		if (a % 3 == 0) {
		System.out.println("number is a good number");
			
		//jar conditin false zhali tr line number 14 and 15 excute honar nahi output fakt line number 12 yel 
		}
		
	}
	}
}
		
		
		
		
	
	
	
	
	
	


