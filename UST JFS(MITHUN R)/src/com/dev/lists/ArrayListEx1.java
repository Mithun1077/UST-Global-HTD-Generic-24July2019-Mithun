package com.dev.lists;

	import java.util.*; 
	
	 
	public class ArrayListEx1 {  
	public static void main(String[] args) {  
	    //Creating list of Books  
		ArrayList<Book> list=new ArrayList<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	    Book b4=new Book(104,"Operating System","Galfffvin","Wiley",90);
	    Book b5=new Book(105,"Operahbhting System","Gafffflvin","Wiley",78);
	    Book b6=new Book(106,"Oating System","Galvin","Wiley",78);
	    //Adding Books to list
	    list.add(null);
	    list.add(null);
	    list.add(null);
	    list.add(null);
	    list.add(null);
	   list.add(b1);  
	    list.add(b2);  
	    list.add(b3);
	    list.add(b4);
	    list.add(b5);
	    list.add(b6);
//	   list.set(3,b6);
//	    System.out.println(list.get(3));
//		ArrayList<Book> list1=new ArrayList<Book>();
//		list1.add(b6);
//		list1.add(b4);
//		list1.add(b3);
////		list1.addAll(list);
//		list1.addAll(2, list);
//	    System.out.println(list.get(4));
//  
//	    System.out.println(list.isEmpty());
//	    System.out.println(list.indexOf(b3));
//	    System.out.println(list.remove(b4));
//	    list.set(2, b5);
//	    list.set(4, b5);

//	    System.out.println(list.removeIf(b4.contains(105)));
	    
	    
//	    Iterator itr=list.iterator();  
//	    while(itr.hasNext()){  
//	     System.out.println(itr.next());  
//	    }
//		 System.out.println(list.lastIndexOf(b5)); 
	    
	   
	    
	    //Traversing list  
	    for(Book b:list){  
	        System.out.println(b);  
	    }  
	}  
	} 


