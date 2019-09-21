package com.dev.Thread;

import java.io.*;
public class DePersist{
 public static void main(String args[])throws Exception{
	 FileInputStream n   =	 new FileInputStream("f.txt");
  ObjectInputStream in=new ObjectInputStream(n);
  Student s=(Student)in.readObject();
  System.out.println(s.id+" "+s.name);

  in.close();
 }
}