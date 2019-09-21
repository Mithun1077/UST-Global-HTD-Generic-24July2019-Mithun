package com.dev.Search;

public class Searching {

	public static void main(String[] args) {
		
		int[] arr = { 10,20,30,34,56,12,22,1,2};
	boolean a=	contains(3, arr);
	System.out.println(a);
		

	}
	public static boolean contains(int value,int[] arr)
	{

		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				return true;
			}
	    }
		return false;
		
	}
	

}
