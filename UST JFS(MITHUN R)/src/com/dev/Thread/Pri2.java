package com.dev.Thread;

public class Pri2 {

	public static void main(String[] args) {

	


				// TODO Auto-generated method stub
				System.out.println("starts");
				
				
				 Printer p = new Printer();
				 
				 Thread4 t4	= new Thread4(p);
				   t4.start();
//				try {
//					t4.sleep(10000);
//				} catch (InterruptedException e) {
//				
//					e.printStackTrace();
//				}
				 
				 new Thread5(p).start();
				

				 System.out.println("ends");
			}



}
