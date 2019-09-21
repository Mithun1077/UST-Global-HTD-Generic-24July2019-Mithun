package com.dev.exception;

public class Demo2 {
	public static void test(int num)
	{
		System.out.println("entering test()");
		int[] a = {11,12,13};
		try
		{
			int res = 50/num;
			System.out.println(res);
			System.out.println(a[num]);
		}
		catch(ArithmeticException ae){
			System.out.println("arthematic");
			System.out.println("invalid");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("index");
			System.out.println("invalid");
		}
		System.out.println("gggggggggggggggggggggggggggg");
		
	}

	public static void main(String[] args) {
		System.out.println("entry");
		test(5);
		System.out.println("exit");

	}

}
