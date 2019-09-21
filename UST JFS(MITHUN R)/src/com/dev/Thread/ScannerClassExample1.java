package com.dev.Thread;

//public class Operation{  
//	 int data=50;  
//	 int data1; 
//	public  int change(int data){  
//	 return data1=data+100;
//	 }  
//	     
//	 public static void main(String args[]){  
//	   Operation op=new Operation();  
//	  
//	   System.out.println("before change "+op.data);  
//	  int h = op.change(500);  
//	   System.out.println("after change "+h);  
//	  
//	 }  
//	}
import java.util.*;  
 
public class ScannerClassExample1 {    
      public static void main(String args[]){                       
          
          //Create scanner Object and pass string in it  
          Scanner scan = new Scanner(System.in);
          System.out.println("enter");
          String s =scan.nextLine();
          //Check if the scanner has a token  
         
          //Print the string  
          System.out.println("String: " +s);  
//          scan.close();     
          System.out.println("--------Enter Your Details-------- ");  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");    
          String name = in.nextLine();   
          System.out.println("Name: " + name);           
          System.out.print("Enter your age: ");  
          int i = in.nextInt();  
          System.out.println("Age: " + i);  
          System.out.print("Enter your salary: ");  
          double d = in.nextDouble();  
          System.out.println("Salary: " + d);         
          in.close();           
          }    
} 
