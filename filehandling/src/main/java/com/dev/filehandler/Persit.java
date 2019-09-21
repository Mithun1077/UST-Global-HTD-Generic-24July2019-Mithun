package com.dev.filehandler;



//import java.io.FileOutputStream;
//import java.io.ObjectOutput;
//import java.io.ObjectOutputStream;
import java.io.*;

class Persist{  
	 public static void main(String args[]){  
	  try{  
	  //Creating the object  
	  Student s1 =new Student(211,"ravi");  
	  //Creating stream and writing the object  
	  FileOutputStream fout=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  out.writeObject(s1);  
//	  FileOutputStream f = new FileOutputStream("f.txt");
//	  ObjectOutputStream d = new  ObjectOutputStream(f);
//	 d.writeObject(s1);
	  out.flush();  
	  //closing the stream  
	  out.close();  
	  System.out.println("success");  
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }  
	 }  
	}
