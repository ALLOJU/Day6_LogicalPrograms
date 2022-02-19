package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {

	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1 to start watch");
		long s=sc.nextLong();
		sw.start();
		System.out.println("enter 2 to stop watch");
		long e=sc.nextLong();
		sw.end();
		long l=sw.getelapsedTime();
		System.out.println("Elapsed time is (milli seconds)  "+l);
		System.out.println("Elapsed time is seconds)  "+(l/1000));

	}

	private long getelapsedTime() {

		elapsed =stopTimer-startTimer;
		return elapsed;
	}

	private void end() {
		
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop time is   "+stopTimer);

	}

	private void start() {
		startTimer=System.currentTimeMillis();
		System.out.println("Start time is   "+startTimer);

	}
}
