package com.dev.exception;
import java.util.*;



class Emp implements Comparable <Emp> {  
int id;
String name,email;
private String password;  
  
public Emp(int id, String name, String email) {  
    this.id = id;  
    this.name = name;  
    this.email = email;  
      
     
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public int compareTo(Emp e) {
	// TODO Auto-generated method stub
	return (this.id-e.id);
}  
}



public class HashSetExample 
{  
public static void main(String[] args)
{
	
   ArrayList<Emp> set=new ArrayList<Emp>();
    
 
    Emp b2=new Emp(102,"Nithin","Nithinias@cdjd");   
    Emp b3=new Emp(103,"Manu","manuias@cdjd");  
    Emp b4=new Emp(104,"Mithun","mithunias@cdjd");
    Emp b1=new Emp(101,"Mithun","mithunias@cdjd"); 
    
    set.add(b4);
    set.add(b3);
    set.add(b1);  
    set.add(b2);  
    set.add(b4);
    System.out.println(set);
    
   

    System.out.println("before");
    
    
//  for(Emp b:set){  
//  System.out.println();  
//  }   
    

     


    System.out.println("after");
    for(Emp b:set){  
        System.out.println(b.id);  
        }
    System.out.println(set.size());
    set.trimToSize();
}








  
} 

