package com.bridgelabz;

import java.util.Scanner;

public class ReverseOfNumber {

	
	private static void reverseofnumber(int n) {
		
		/*
		 * declaring variables rev for reverse of a number, rem for remainder
		 */
		int rev=0;
		int rem=0;
		while(n>0) {
			
			rem=n %10;
			rev=(rev*10)+rem;
			n= n/10;
		}
		System.out.println("reverse of a number "+rev);
		
	}
	public static void main(String[] args) {
		int number;
		//taking input from user using scanner object
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		
		//declaring an integer number and assigning value from scanner object using 
		int n=sc.nextInt();
		
		reverseofnumber(n);
	}

	
}
