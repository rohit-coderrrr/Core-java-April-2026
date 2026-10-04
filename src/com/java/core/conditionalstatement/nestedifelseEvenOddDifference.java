package com.java.core.conditionalstatement;

import java.util.Scanner;

public class nestedifelseEvenOddDifference {
	
	public static void main(String[] args) {
		
		//input two number
		//print larger number only if it is even
		//else print smaller number
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter first number");
		int a = sc.nextInt();
		
		System.err.println("Enter second number");
		int b = sc.nextInt();
		
		if (a > b) {
			
			if (a % 2 == 0) {
				System.out.println("a");
				}
			else {
				System.out.println("b");
				}
		} else {
			
			if (b %2 == 0) {
				System.out.println("b");
			}else{
				System.out.println("a");
				
				
				
				
			}
				
				
			}
			
			
		}
		
		
		
	}


