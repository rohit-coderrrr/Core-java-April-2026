package com.java.core.scanner;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		//take input from console to java file 
		Scanner sc = new Scanner (System.in);
		
		//1. int as a input
		System.out.println("Please enter of your birth : ");
		int yob = sc.nextInt();
		System.out.println("Input givem is : " +yob);
		
		//2. String as a input 
		System.out.println("Enter a city name : ");
		String city = sc.next();
		System.out.println("City is : " + city);
	}

}
