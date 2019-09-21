package com.dev.Thread;

public class Pri1 {

	public static void main(String[] args) throws InterruptedException {


				
				System.out.println("starts");
				
				
				 Printer p = new Printer();
				 
				 
				 Thread4 t4	= new Thread4(p);
			System.out.println( t4.isAlive());	
				   t4.start();
					System.out.println( t4.isAlive());	
//				   t4.join();
					
				 

				   Thread5 t5 = new  Thread5(p);
				   t5.start();
				   System.out.println( t5.isAlive());
				   t4.yield();
				   
				
				

				 System.out.println("ends");
			}

		}

