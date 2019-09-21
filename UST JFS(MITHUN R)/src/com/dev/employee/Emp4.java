package com.dev.employee;
//import java.util.*;


public class Emp4 {
	
	 public  static double salaryInHand(double salary)
	 {
		 
		 if(salary>1000000)
			{
				System.out.println("AA");
				double salary1 = ((salary*9.35)/100)+(12*5619);
				double salary2 = salary-salary1;
				return salary2;
				
			}
			else if(salary>860000 && salary<=1000000)
			{
				System.out.println("A");
				double salary1 = ((salary*8.87)/100)+(12*4876);
				double salary2 = salary-salary1;
				return salary2;
				
			}
			else if(salary>540000 && salary<=860000 )
			{
				System.out.println("b");
				double salary1 = ((salary*8.19)/100)+(12*4321);
				double salary2 = salary-salary1;
				return salary2;
				
			}
			else if(salary>380000 && salary<=540000 )
			{
				System.out.println("c");
				double salary1 = ((salary*7.34)/100)+(12*3765);
				double salary2 = salary-salary1;
				return salary2;
				
			}
			else 
			{
				System.out.println("d");
				double salary1 = ((salary*5.4)/100)+(12*3189);
				double salary2 = salary-salary1;
				return salary2;
				
			}
			
		}

	public static void main(String[] args) {
		
		Emp3 a = new Emp3();
		
		Emp1 b = new Emp1();
		
		b.setEmail("mithunia@vvf");
		b.setEname("Mithun");
		b.setEmp_id(100);
		b.setPassword("jcdj");
		b.setSalary(810788.00);
		
       Emp1 b1 = new Emp1();
		
		b1.setEmail("nithunia@vvf");
		b1.setEname("nithun");
		b1.setEmp_id(101);
		b1.setPassword("jcdddddddddddddddj");
		b1.setSalary(2010788.00);
		
		
		a.add(b.getEmp_id(),b );
		a.add(b1.getEmp_id(),b1 );

	    a.update(b1.getEmp_id(),b1);
	    
	    a.retrive(b1.getEmp_id());
	    a.delete(b1.getEmp_id());
	    
		System.out.println("total salary  = "+b.getSalary()+" Rs only/-");
	    
	    double salhand = salaryInHand( b.getSalary());
	    System.out.println("salary in hand of an employee = " +salhand+" Rs only/-");	
		
	}

}
