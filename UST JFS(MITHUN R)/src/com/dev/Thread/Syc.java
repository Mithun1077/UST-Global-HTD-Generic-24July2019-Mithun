package com.dev.Thread;

public class Syc {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.out.println("starts");
		
//		https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/FileUtils.html
		
		 Printer p = new Printer();
		 
		 
		
		 Thread4 t4	= new Thread4(p);
		   t4.start();
		 
		   

		
		 
		   
			 Thread5 t5	= new Thread5(p);

		  t5.start();

		
		
		
//		 for(int j = 0;j<=7;j++)
//			{
//				System.out.println(j);
//			}
		 System.out.println("ends");
	}

	

}
