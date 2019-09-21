package com.dev.Thread;

public class WrapperExample1{  
public static void main(String args[]){  
//Converting int into Integer  
int a=20; 
byte n =1;
Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
 Byte k = n; 
System.out.println(a+" "+n+" "+j);

Integer g=new Integer(3);    
int l=g.intValue();//converting Integer to int explicitly  
int m=g;//unboxing, now compiler will write a.intValue() internally    
    
System.out.println(g+" "+l+" "+m); 
}} 
