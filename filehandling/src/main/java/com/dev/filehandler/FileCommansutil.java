package com.dev.filehandler;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommansutil {

	public static void main(String[] args) throws IOException {
	 File file = new File("E:/Tffext.txt");
	 FileUtils.touch(file);
	  
   if(file.exists())
	 {
		 System.out.println("file exits");
	 }
	 else
	 {
		 System.out.println("noo....");
	 }
   
   
   System.out.println(file.canWrite());

   
     FileUtils.deleteQuietly(file);
     
     System.out.println(file.canRead()); 
  
 
   
       if(file.exists())
	 {
		 System.out.println("file exits");
	 }
	 else
	 {
		 System.out.println("noo....");
	 }
	 
	 }

}
