package com.dev.lists;

import java.util.*;

public class LinkedListExample {  
		public static void main(String[] args) {  
		    //Creating list of Books  
		    LinkedList<Book> list=new LinkedList<Book>();  
		    //Creating Books  
		    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
		    Book b4=new Book(104,"Let us C","Yashwant Kanetkar","BPB",8);  
		    Book b5=new Book(105,"Let us C","Yashwant Kanetkar","BPB",8);  
		    Book b6=new Book(106,"Let us C","Yashwant Kanetkar","BPB",8);  
		    //Adding Books to list 
		    
//		    list.add(b1);  
//		    list.add(b2);  
//		    list.add(b3);
//		    list.add(b4);
//		    list.add(b5);
//		    list.add(b6);
//		    
//		    list.add(b1);
//		    list.add(b4);
		    list.push(b1);  
		    list.push(b2);  
		    list.push(b3);
		    list.push(b4);
		    list.push(b5);
		    list.push(b6);
//		    list.addFirst(b4);
//		    list.addLast(b3);
//		    list.add(b3);
//		    list.add(1, b4);
	   
		 System.out.println("ddjfd"+ list.get(2));  
		 
		    
		   System.out.println(list.contains(b2)); 
//		   
 
//		    
//		  System.out.println(list.pop());  
//		    
//		  System.out.println( list.get(3)); 
//		  System.out.println(list.getFirst());
//		  System.out.println(list.getLast());
		    
		    
		    //Traversing list  
		    for(Book b:list){  
		    System.out.println(b);  
		    } 
	
//		System.out.println(list.pop());
//		    System.out.println(list.remove());
			
		}  
		}

