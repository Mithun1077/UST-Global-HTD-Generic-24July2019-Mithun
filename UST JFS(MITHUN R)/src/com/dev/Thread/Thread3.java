package com.dev.Thread;


	public class Thread3 implements Runnable {
		
		
		public void run()
		{
			System.out.println("t3 started");
			
			
			for(int i = 1;i<=4;i++)
			{
				System.out.println(i+" =k");
			}
			System.out.println(Thread.currentThread().getName());
			
			System.out.println("t3 terminated");
		}
		

	}


