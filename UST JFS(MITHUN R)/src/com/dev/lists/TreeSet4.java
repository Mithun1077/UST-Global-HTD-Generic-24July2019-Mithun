package com.dev.lists;

import java.util.*;  
public class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
           
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");
         set.add("A");
         set.add("a");
         set.add("x");
//         System.out.println(set.pollLast());
//      System.out.println(set.pollFirst());
//   System.out.println(set.descendingSet()); 
    System.out.println(set.first());
    System.out.println(set.last());

           
//         System.out.println("Intial Set: "+set);  
//           
//         System.out.println("Head Set: "+set.headSet("C"));  
//          
         System.out.println("SubSet: "+set.subSet("A", "D"));  
//           
         System.out.println("TailSet: "+set.tailSet("D")); 
         for(String v : set)
         {
        	 System.out.println(v);
         }
         System.out.println(set.lower("a")); 
         System.out.println(set.higher("a"));
 }  
}
