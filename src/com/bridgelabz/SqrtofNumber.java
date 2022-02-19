package com.bridgelabz;

import java.util.Scanner;

public class SqrtofNumber {

	
	
	private static double calculateSqrt(double c) {
		
		double t=c;
		double epsilon=1e-15;
		
		while(Math.abs(t-c/t) > epsilon*t) {
			
			t=(c/t + t) / 2.0 ;
		}
		
		return t;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a non negative number");
		double c=sc.nextDouble();
		double squareroot=calculateSqrt(c);
		System.out.println("Square root of a given number is "+squareroot);
	}

	
}
