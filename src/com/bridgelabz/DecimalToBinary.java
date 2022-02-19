package com.bridgelabz;

import java.util.Scanner;

public class DecimalToBinary {

	
	public static void toBinary(int n) {
		int b = 0;
		String x="";
		 while(n > 0)
	        {
	           int  a = n % 2;
	           
	            x = a + "" + x;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int n=sc.nextInt();
		toBinary(n);
		
	}
}
