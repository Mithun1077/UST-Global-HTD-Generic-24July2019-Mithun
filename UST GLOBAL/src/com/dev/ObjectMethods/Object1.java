package com.dev.ObjectMethods;

public class Object1 {
	public static void main(String args[])
	{
		Obj2 b = new Obj2();
		Obj2 b1 = new Obj2();
		System.out.println(b.getClass());
		System.out.println(b.toString());
		System.out.println(b.equals(b1));
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
	}

}
