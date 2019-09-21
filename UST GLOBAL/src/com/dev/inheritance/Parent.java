package com.dev.inheritance;

public class Parent {

	public int add(int a,int b)
	{
		int sum;
		sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public int add(int a,int b,int c)
	{
		int sum;
		sum=a+b+c;
		System.out.println(sum);
		return sum;
	}
	public int add(int a,int b,int c,int d)
	{
		int sum;
		sum=a+b+c+d;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		Parent f = new Parent();
	f.add(12,56);
	f.add(12,56,67);
	f.add(12,56,99,56);
	

	}

}
