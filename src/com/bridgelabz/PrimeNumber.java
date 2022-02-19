package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrimeNumber p=new PrimeNumber();
		p.isPrimeNumber(n);
	}

	private void isPrimeNumber(int n) {
		
		boolean flag=false;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("given numer is prime number");
		}
		else {
			System.out.println("given numer is not  prime number");
		}
		
	}
}
