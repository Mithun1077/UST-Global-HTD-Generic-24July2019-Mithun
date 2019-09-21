package com.dev.methods;

public class MethodOver {
	public void print(int i,int k,double j)
	{
		System.out.println("sub="+(j-i-k));
	}
	public void print(int i,double j)
	{
		System.out.println("sub="+(j-i));
	}
	public void print(int i,double j,int k,double l)
	{
		System.out.println("sub="+(j-i-k-l));
	}
	public void print(int i,int j)
	{
		System.out.println("add="+(j+i));
	}
	public void print(int i,int j,int o,int p)
	{
		System.out.println("add="+(j+p+o+i));
	}
	public void print(int i,int j,int g)
	{
		System.out.println("add="+(j+i+g));
	}
	
	 void print(float j,int i,double k)
	{
		System.out.println("mul="+(j*i));
	}
	public void print(double j,float i)
	{
		System.out.println("mul="+(j*i));
	}
	private void print(double j,int i,float k)
	{
		System.out.println("mul="+(j*i));
	}
	
	private void print(float j,int i,float k)
	{
		System.out.println("div="+(j/i));
	}
	public void print(float j,float k,int i)
	{
		System.out.println("div="+(j/i));
	}
	final void print(float j,int i)
	{
		System.out.println("div="+(j/i));
	}
	

	public static void main(String[] args) {
		MethodOver j = new MethodOver();
		j.print(5,8,78);
		j.print(45,56,98.0);
		j.print(45.89f,56,98.0);
		j.print(34.67f, 78,223.98f);
		
	

	}

}
