package com.dev.employee2;

import java.util.HashMap;

import com.dev.employee.Emp1;
 import java.util.*;

public class Emp13 implements Emp12 {
	
	HashMap<Integer,Emp11> hm = new HashMap<Integer,Emp11>();

	@Override
	public void add(int key, Emp11 value ) {
		hm.put(key, value);
		System.out.println(hm.put(key, value));
	
		
	}

	@Override
	public void delete(int key) {
	System.out.println(hm.remove(key));
		
	}

	@Override
	public void update(int key, Emp11 value) {
		value.setEmail("hchdcdhc");
		

		
	}

	@Override
	public void retrive(int key) {
	System.out.println(hm.get(key));
	
	
		
	}

	

}
