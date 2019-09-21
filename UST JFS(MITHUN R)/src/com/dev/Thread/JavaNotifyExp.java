package com.dev.Thread;


//	public class JavaYieldExp extends Thread  
//	{  
//	    public void run()  
//	    {  
//	    	
//	        for (int i=0; i<3 ; i++)  
//	            System.out.println(Thread.currentThread().getName() + " in control");  
//	    }  
//	    public static void main(String[]args)  
//	    {  
//	        JavaYieldExp t1 = new JavaYieldExp();  
//	        JavaYieldExp t2 = new JavaYieldExp();  
//	        // this will call run() method  
//	        t1.start();
//	    
//	       
//	        t2.start();
//	  
//	       
//	        
//	        for (int i=0; i<3; i++)  
//	        {  
//	            t1.yield();
//	            System.out.println(Thread.currentThread().getName() + " in control");  
//	        }  
//	    }  
//	} 
//public class JavaSuspendExp extends Thread  
//{    
//    public void run()  
//    {    
//        for(int i=1; i<5; i++)  
//        {    
//            try  
//            {  
//                // thread to sleep for 500 milliseconds  
//                 sleep(500);  
//                 System.out.println(Thread.currentThread().getName());    
//            }catch(InterruptedException e){System.out.println(e);}    
//            System.out.println(i);    
//        }    
//    }    
//    public static void main(String args[])  
//    {    
//        // creating three threads   
//        JavaSuspendExp t1=new JavaSuspendExp ();    
//        JavaSuspendExp t2=new JavaSuspendExp ();   
//        JavaSuspendExp t3=new JavaSuspendExp ();   
//        // call run() method   
//        t1.start();  
//        t2.start();  
//        // suspend t2 thread   
//        t2.suspend();   
//        // call run() method   
//        t3.start();
//        t2.resume();
//    }    
//}
//public class JavaStopExp extends Thread  
//{    
//    public void run()  
//    {    
//        for(int i=1; i<5; i++)  
//        {    
//            try  
//            {  
//                // thread to sleep for 500 milliseconds  
//                sleep(500);  
//                System.out.println(Thread.currentThread().getName());    
//            }catch(InterruptedException e){System.out.println(e);}    
//            System.out.println(i);    
//        }    
//    }    
//    public static void main(String args[])  
//    {    
//        // creating three threads   
//        JavaStopExp t1=new JavaStopExp ();    
//        JavaStopExp t2=new JavaStopExp ();   
//        JavaStopExp t3=new JavaStopExp ();   
//        // call run() method   
//        t1.start();  
//        t2.start();  
//        // stop t3 thread   
//          t3.start();
//         
//          t3.stop();
//         
//        System.out.println("Thread t3 is stopped");    
//    }
//	private void destroy() {
//		// TODO Auto-generated method stub
//		
//	}    
//}
	class Notify1 extends Thread   
	{  
	    public void run()  
	    {  
	        synchronized(this)  
	        {  
	            System.out.println("Starting of " + Thread.currentThread().getName());  
	            try {  
	                this.wait();  
	            }  
	            catch (InterruptedException e) {  
	                e.printStackTrace();}  
	            System.out.println(Thread.currentThread().getName() + "...notifiehgwhgwd");  
	        }  
	    }  
	}
	
	class Notify2 extends Thread {  
	    Notify1 notify1;  
	    Notify2(Notify1 notify1)  
	    {  
	        this.notify1 = notify1;  
	    }  
	    
	    public void run()  
	    {  
	        synchronized(this.notify1)  
	        {  
	            System.out.println("Starting of " + Thread.currentThread().getName());  
	            try {  
	                this.notify1.wait();  
	            }  
	            catch (InterruptedException e) {  
	                e.printStackTrace();  
	            }  
	            System.out.println(Thread.currentThread().getName() + "...notiffdfied");  
	        }  
	    }  
	}   
	class Notify3 extends Thread   
	{ 
		
	    Notify1 notify1;  
	    Notify3(Notify1 notify1)  
	    {  
	        this.notify1 = notify1;  
	    }  
	    public void run()  
	    {  
	        synchronized(this.notify1)  
	        {  
	            System.out.println("Starting of " + Thread.currentThread().getName());  
	            // call the notify() method  
            this.notify1.notify();
     
            
	            System.out.println(Thread.currentThread().getName() + "...notified");
	            
	        }  
	    }  
	}  
	public class JavaNotifyExp   
	{  
	    public static void main(String[] args) throws InterruptedException  
	    {  
	        Notify1 notify1 = new Notify1();  
	        Notify2 notify2 = new Notify2(notify1);  
	        Notify3 notify3 = new Notify3(notify1);  
	          
	        // creating the threads   
	        Thread t1 = new Thread(notify1, "Thread-1");  
	        Thread t2 = new Thread(notify2, "Thread-2");  
	        Thread t3 = new Thread(notify3, "Thread-3");  
	          
	        // call run() method  
	        t1.start();  
	        t2.start();  
	        Thread.sleep(100);  
	        t3.start();  
	    }  
	}



