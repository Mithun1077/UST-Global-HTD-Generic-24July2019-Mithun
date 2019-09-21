package com.dev.methods;

public class MethodsExamples {


	public static double areaCircle(double radius) {
		double sum;
		sum = 3.14*radius*radius;
		return sum;

	}
	
	public static double areaTriangle(double length,double breath) {
		double sum;
		sum= 0.5*length*breath;
		return sum;

	}
	public static double average(int b,int a,int c) {
		int sum;
		double avg;
		sum=a+b+c;
		avg = sum/3;
		return avg;
	}



}
