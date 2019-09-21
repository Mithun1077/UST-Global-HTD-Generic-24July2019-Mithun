package com.dev.exception;

import java.util.*;

public class Book2 implements Book3 {
	HashMap<Integer,Book> hm = new HashMap<Integer,Book>();

	@Override
	public boolean add(int key, Book value) {
		 System.out.println(hm.put(key, value));
		 System.out.println(hm.put(key, value));
		return true;

		
	}

	@Override
	public void delete(int key,Book value ) {
		System.out.println(hm.remove(key, value));
		
	}

	@Override
	public boolean retrive(int key) {
		System.out.println(hm.get(key));
		System.out.println(hm.get(key));
		return true;
		
		
	}

	@Override
	public void update(int key, Book value) {
		System.out.println(hm.put(key, value));
		System.out.println(hm.put(key, value));
	} 

}
