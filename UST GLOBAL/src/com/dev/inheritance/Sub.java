package com.dev.inheritance;

public class Sub extends Parent {
	@Override
	public int add(int a,int b)
	{
		int sum;
		sum=a-b;
	
		System.out.println("overrided int a,int b");
		return sum;
	}
	@Override
	public int add(int a,int b,int c)
	{
		int sum;
		sum=a-b-c;
		
		System.out.println("overrided ");
		return sum;
	}

	public static void main(String[] args) {
		Sub d = new Sub();
		int g = d.add(34,2);
		int f = d.add(34,78,2);
		System.out.println(g);
		System.out.println(f);

	}

}
