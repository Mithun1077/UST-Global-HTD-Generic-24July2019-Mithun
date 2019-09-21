package com.dev.employee;

import java.util.*;

public class Emp3 implements Emp2 {
	HashMap<Integer,Emp1> hm = new HashMap<Integer,Emp1>();



	@Override
	public void add(int key, Emp1 value) {
	    hm.put(key, value);
		System.out.println(hm.put(key, value));
	
		
	}

	@Override
	public void delete(int key) {
		
//		System.out.println(hm.remove(key));
		
	}
	

	@Override
	public void update(int key, Emp1 value)
	{
//		value.setEmail("jfdfdhj@kdkjd");
		value.setEmail("dfhdfh@hffhd");
		
		
		
	 
//		System.out.println(hm.replace(key, value.getEmail(),value1.getEmail()));
//		System.out.println(hm.put(key, value.getEmail()));
    
	}

	@Override
	public void retrive(int key) {
		// TODO Auto-generated method stub
//		System.out.println(hm.get(key));
//		System.out.println(hm.get(key));
	
		
	}

}
