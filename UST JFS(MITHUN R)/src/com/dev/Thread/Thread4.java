package com.dev.Thread;

public class Thread4 extends Thread {
	Printer p;
	
	
	
	public Thread4(Printer pref){
		p = pref;
		
	}
	
	public void run()
	{
//		System.out.println("thread is alive = "+thre);

		p.printVal(10, "thread 4");
		
	}

}
