package com.bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {


	private static double FahrenheitToCelsius(double f) {
		double c= (f-32) * 5/9 ;
		return c;

	}
	private static double CelsiusToFahrenheit(double c) {
		double f =((9*c)/5)+32;
		return f;
	}

	public static void main(String[] args) {
		double f,c;
		TemperatureConversion tc=new TemperatureConversion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fahrenheit: Temperature");
		f=sc.nextDouble();
		double Celsius=FahrenheitToCelsius(f);
		System.out.println("Celsius value for Fahrenheit is "+Celsius);

		System.out.println("Enter Celsius: Temperature");
		c=sc.nextDouble();
		double Fahrenheit=CelsiusToFahrenheit(c);
		System.out.println("Fahrenheit value for given Celsius is "+Fahrenheit);



	}



}
