package com.java.coretwoclass;

public class Test {
	
	public static void main(String[] args) {
		
		
		//Requirement = fname = john and lname=wicks
		//Username = jhonwicks99
		
		//HomeWork -> Take fname, lname and yob dynamically using scanner
		
		UsernameGenerator generator = new UsernameGenerator();
		
		String username = generator.getUsername ("John", "Wicks", 1999);
		
		System.out.println("Username is : " + username);
		
		
		
	}

}
