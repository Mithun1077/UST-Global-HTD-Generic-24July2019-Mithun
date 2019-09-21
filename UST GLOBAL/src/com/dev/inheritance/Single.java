package com.dev.inheritance;



//public class Single {
//
//	 String lastname = "stark";
//	 String name = "troo";
//	
//	public static void main(String[] args) {
//		 Single g = new Single(); 
//		g.printname();
//	}
//	public void printname()
//	{
//		printName();
//		System.out.println(name+" "+ lastname );
//	}
//	public void printName()
//	{
//		
//		System.out.println(name );
//	}
//
//}
public class Single {

	 String lastname = "sta";
	 String name = "tr";
	 public Single(int e) {
		 System.out.println("no args");
	 }
	 public Single(int i,String j) {
		 System.out.println("int and String"); 
	 }
	 public Single(String j ,int i) {
		 System.out.println("string and int");
		 
	 }
	 public Single() {
		
		 System.out.println("int"); 
	 }

	protected void printname(int f)
	{
		System.out.println(name+" "+ lastname );
	}
	public static void main(String[] args) {
//		Single g = new Single("disd",89);
//		g.printname();
	}

}
