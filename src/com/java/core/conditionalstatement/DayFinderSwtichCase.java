package com.java.core.conditionalstatement;

import java.util.Scanner;

public class DayFinderSwtichCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7");
		int input = sc.nextInt();
		
		switch (input) {
		case 1: {
			System.out.println("MONDAY");
			}
		break;
		case 2: {
			System.out.println("THESDAY");
			}
		break;
		case 3: {
			System.out.println("WEDNESDAY");
			}
		break;
		case 4: {
			System.out.println("THURSDAY");
			}
		break;
		case 5: {
			System.out.println("FRYDAY");
			}
		break;
		case 6: {
			System.out.println("SATURDAY");
			}
		break;
		
		case 7: {
			System.out.println("SUNDAY");
			}
		default:
			System.out.println("Enter a proper number");
			
		}
		
		
	}
	
	
	

}
