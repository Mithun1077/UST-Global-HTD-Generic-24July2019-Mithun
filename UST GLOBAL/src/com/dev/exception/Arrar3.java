package com.dev.exception;
import java.util.*;


//		 int [] arr = {10, 20, 30, 40, 50,67,45};
//		 System.out.println(arr[0]+arr[(arr.length-1)/2]+arr[arr.length-2]);
		   
		 public class Arrar3{ 
			 
		 public static void main(String args[]){ 
			 
		 PriorityQueue<String> queue=new PriorityQueue<String>();  
		 queue.add("Amit Sharma"); 
		 queue.add("Jai");
		 queue.add("nkar");
		 queue.add("JaiShankar");  
		 queue.add("Raj");
		 queue.add("Vijay Raj"); 
//		 System.out.println("head:"+queue.element());  
//		 System.out.println("head:"+queue.peek());  
		 System.out.println("iterating the queue elements:");  
		 Iterator itr=queue.iterator();  
		 while(itr.hasNext()){  
		 System.out.println(itr.next());  
		 }  
//		 queue.remove();  
//		 queue.poll();  
		 System.out.println("after removing two elements:");  
		 Iterator<String> itr2=queue.iterator();  
		 while(itr2.hasNext())
		 {  
		 System.out.println(itr2.next());  
		 }
		 
		 }  
		 
	
		 
	    }


