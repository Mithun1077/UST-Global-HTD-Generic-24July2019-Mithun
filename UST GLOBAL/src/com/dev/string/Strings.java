package com.dev.string;

public class Strings {

	
	
	
	public static void main(String[] args) {
		String str = "Hello mithun";//declering and initilization
		String str1 = new String("hello nithin");//declering and initilization
		String str2 = " ";
		StringBuilder
		
		System.out.println(str.length());
		System.out.println(str1.length());//utilization
		if(str1.length()>=str.length())
		{
			System.out.println("equals");
		}
		char a = str.charAt(7);
		System.out.println(a);
		for(int i=str.length()-1;i>=0;i--)
		{
			str2 = str2+str.charAt(i);
		}
		System.out.println(str2);
		System.out.println(str.substring(0,11));
		System.out.println(str.concat(str2));
		System.out.println(str1.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		char[] ch = str.toCharArray();
		System.out.println(ch[7]);
		System.out.println(str.contains("hello"));
		System.out.println(str.replace('t', 'p'));
		System.out.println(str.indexOf('k'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		
		


	}

}
