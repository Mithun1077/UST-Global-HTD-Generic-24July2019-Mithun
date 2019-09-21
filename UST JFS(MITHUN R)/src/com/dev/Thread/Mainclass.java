package com.dev.Thread;

public class Mainclass {

	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("main thread");
	
	
//	Thread.currentThread().setName("djfdfj");
//	Thread.currentThread().setPriority(7);
	
	Thread3 t3 = new Thread3();
     Thread t = new Thread(t3);
   
   
     
     
	
     Thread2 t2 = new Thread2();
     
     
  
	  t2.start();
	  t2.join();
	
	   t.start();
//	   t.join();
	  
	  
	 
	
	  
	  
	  for(int i = 1;i<=4;i++)
		{
		  t2.yield();
		  
			System.out.println(i+"main control");
		}
	
	 
	 

	
	System.out.println(Thread.currentThread().getName());
	System.out.println("thread2 id = "+t2.getId());
	System.out.println("thread3 id = "+t.getId());
//	System.out.println("thread2 priority = "+t2.getPriority());
//	System.out.println("thread3 priority  = "+t.getPriority());
//	System.out.println("main thread pririty = "+Thread.currentThread().getPriority());
	
	System.out.println("main thread id = "+Thread.currentThread().getId());
	System.out.println("main thread termiated");

	}

}
