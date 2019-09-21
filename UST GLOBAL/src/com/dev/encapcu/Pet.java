package com.dev.encapcu;

public class Pet  {
	

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		
		System.out.println(d1.getClass());
		System.out.println(d1.toString());
		System.out.println(d1.equals(c1));
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());
		
		
		
		d1.setAge(12);
		d1.setName("manju");
        d2.setAge(2);
        d2.setName("nithin");
        d3.setAge(3);
        d3.setName("manju");
        c1.setAge(3);
        c1.setName("manju");
        c2.setAge(3);
        c2.setName("manju");
        c3.setAge(3);
        c3.setName("manju");
        
        Dog[] dogs = {d1,d2,d3};
        Cat[] cats = {c1,c2,c3};
        for(int i=0;i<=dogs.length-1;i++)
        {
        	System.out.println(dogs[i].getAge());
        	System.out.println(dogs[i].getName());
        }
        for(int i=0;i<=cats.length-1;i++)
        {
        	System.out.println(cats[i].getAge());
        	System.out.println(cats[i].getName());
        }
	}

}
