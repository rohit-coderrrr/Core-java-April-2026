package com.java.core.conditionalstatement;

import java.util.Scanner;

public class DayFinder {
	
	public static void main(String[] args) {
	
	//input is number eg 1
	//output -> Monday
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number between 1 to 7");
		int input = sc.nextInt();
		
	//err ya sathi te direct error fond madhe visible karat
		
		if(input == 1) {
			System.out.println("MONDAY");
		}
		else if(input == 2) {
			System.out.println("THESDAY");
		}
		else if(input == 3) {
			System.out.println("WEDNESDAY");
		}
		else if(input == 4) {
			System.out.println("THURSDAY");
		}
		else if(input == 5) {
			System.out.println("FRYDAY");
		}
		else if (input == 6) {
			System.out.println("SATURDAY");
		}
		else if(input == 7) {
			System.out.println("SUNDAY");
		}
		else {
			System.out.println("Please enter a proper number..");
		}	

}
}