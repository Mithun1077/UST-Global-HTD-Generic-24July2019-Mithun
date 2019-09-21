package com.dev.exception;
import java.util.*;

public class Book4 {

	public static void main(String[] args) {
		Book2 k = new Book2 ();
		
		Book a = new Book();
		a.setEmail("cjdcjdhduvc");
		a.setId(100);
		a.setName("a");
		a.setPassword("jdjdbvj");
		
		Book a1 = new Book();
		a1.setEmail("cjdhduvc");
		a1.setId(101);
		a1.setName("c");
		a1.setPassword("jdjdbvj");
		
		Book a2 = new Book();
		a2.setEmail("jdhduvc");
		a2.setId(102);
		a2.setName("b");
		a2.setPassword("dbvj");
		
		k.add(1, a);
		k.add(2, a1);
		k.add(3,a2);
//		System.out.println(a.getId());
		k.delete(2, a2);
		
		
		k.retrive(1);

		k.update(2, a);
//		System.out.println(k.retrive(2));
//		System.out.println(k.retrive(3));
//		System.out.println(k.retrive(2));
		
		
		
		

	}

}