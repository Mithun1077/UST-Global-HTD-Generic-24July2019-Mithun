package com.dev.Thread;

public class Thread5 extends Thread {
	Printer o;
	
	public Thread5(Printer pref){
		o = pref;
		
	}
	
	public void run()
	{
		
//        try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
		
	
	   
	   
		o.printVal(10, "thread 5");
		
		
	}

}