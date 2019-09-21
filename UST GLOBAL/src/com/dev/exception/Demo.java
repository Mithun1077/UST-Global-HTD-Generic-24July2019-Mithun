package com.dev.exception;

public class Demo {

	 static void fun() throws CustomException
	    { 
	    
	    	
	    		
	     System.out.println("fufhdfuh");
	   
	    	 ArithmeticException	e = new ArithmeticException();
//	 	     
			   throw e;
	    	 
	     
    
     

//	            throw new CustomException("akfafaf"); 
	            
	           
	         
//	        catch(Exception r) 
//	        { 
//	            System.out.println("Caught inside fun()."); 
//	            throw r; // rethrowing the exception 
//	        } 
	    }
	
	
	  
	    public static void main(String args[])  
	    { 
	    	System.out.println("starts");
	        try
	        { 
	            fun(); 
	        } 
	        
	        catch(Exception t) 
	        { 
	        	  t.printStackTrace();
//	        	System.out.println(r.getMessage());
//	        	System.out.println(r.getLocalizedMessage());
	      
	        
	            System.out.println("Caught in main."); 
	        } 
	    } 
	
		

	}


