package com.dev.lamda;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamda v = (int num) -> 
		{
			for(int i = 1 ; i<=num;i++)
			{
				System.out.println(i);
			}
		};
//		v.code(5);
	
	Lamda  l = (int num) ->
	{
		try {
			int k= (10/num);
			System.out.println("works");
			}
		catch(Exception e)
		{
			throw e;
//			System.out.println("ddfvvvvvvvvvvvdsfsd");
		}
	};
	l.code(0);
	
	
	

	}
	
}



