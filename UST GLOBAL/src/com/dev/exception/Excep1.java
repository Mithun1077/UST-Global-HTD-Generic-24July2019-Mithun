package com.dev.exception;



public class Excep1 extends CustomException  {

	public static void main(String[] args) throws CustomException {
	try {
		div(10,0);
		
	}catch(Exception e)
	{
		throw new CustomException(10);
	}


	}
	public static int divd74 (int i,int j)
	
	{
		int res =i/j;
		System.out.println(res);
		return 1;
	
	}

}
