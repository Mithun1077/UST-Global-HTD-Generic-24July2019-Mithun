package com.dev.methods;

public class Methods {
	public Methods( int i) {
//		this();
		System.out.println("int i");
		
	}
	public Methods() {
		
		
		System.out.println("empty");
	}
public Methods(String s) {
//	this(50);
		
		System.out.println("String s");
	}
public Methods(String s,int t) {
//	this(50);
		
		System.out.println("String s,int t");
	}
public Methods(int s,String t) {
//	this(50);
		
		System.out.println("int s,String t");
	}
public Methods(double s,String t) {
//	this(50);
		
		System.out.println("double s,String t");
	}

	public static void main(String[] args) {
		Methods e = new Methods("wert");
		Methods r = new Methods(89);
		Methods y = new Methods();
		Methods u = new Methods("ghj",56);
		Methods c = new Methods(98,"hjdkfg");
		Methods l = new Methods(56.78,"jsjdhdh");
		
		

	}

}
