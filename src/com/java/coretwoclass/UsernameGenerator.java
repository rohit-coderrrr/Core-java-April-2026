package com.java.coretwoclass;

public class UsernameGenerator {
	
	public String getUsername(String fname , String lname , int yob) {
		
		//yob = 1999/100 -> Q=90, R=99
		
		int year = yob  % 100;
		
		String username = fname + lname + year;
		
		return username;
		
		
		
		
	}

}
