package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

	
	public static int isPerfectNumber(long n) {
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i; 
			}
		}
		return sum;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		long n=sc.nextLong();
		
		PerfectNumber p=new PerfectNumber();
		long s=p.isPerfectNumber(n);
		if(s==n) {
			System.out.println("given number is perfect number");
		}
		else {
			System.out.println("given number is not perfect number");
		}
	}
}
