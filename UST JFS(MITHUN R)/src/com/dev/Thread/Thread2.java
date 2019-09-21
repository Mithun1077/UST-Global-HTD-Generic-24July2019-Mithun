package com.dev.Thread;

public class Thread2 extends Thread {
	
	
	  public void run()
	{
		
		System.out.println("t2 started");
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for(int i = 1;i<=4;i++)
		{
			System.out.println(i+" =i");
		}
		
		System.out.println(Thread.currentThread().getName());
		
		
		System.out.println("t2 terminated");
	}

}
