package com.dev.employee2;

import java.util.Scanner;

public class Emp14 {

	public static double salaryInHand(double salary) {

		if (salary > 1000000) {
			System.out.println("AA");
			double salary1 = ((salary * 9.35) / 100) + (12 * 5619);
			double salary2 = salary - salary1;
			return salary2;

		} else if (salary > 860000 && salary <= 1000000) {
			System.out.println("A");
			double salary1 = ((salary * 8.87) / 100) + (12 * 4876);
			double salary2 = salary - salary1;
			return salary2;

		} else if (salary > 540000 && salary <= 860000) {
			System.out.println("b");
			double salary1 = ((salary * 8.19) / 100) + (12 * 4321);
			double salary2 = salary - salary1;
			return salary2;

		} else if (salary > 380000 && salary <= 540000) {
			System.out.println("c");
			double salary1 = ((salary * 7.34) / 100) + (12 * 3765);
			double salary2 = salary - salary1;
			return salary2;

		} else {
			System.out.println("d");
			double salary1 = ((salary * 5.4) / 100) + (12 * 3189);
			double salary2 = salary - salary1;
			return salary2;

		}

	}

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		Emp13 a = new Emp13();

		Emp11 b1 = new Emp11();
		b1.setEmail("cbhcbdh@cd");
		b1.setEmpId(123);
		b1.setName("djfh");
		b1.setSalary(1116711);
		b1.setPassword("chbchc");

		Emp11 b2 = new Emp11();
		b2.setEmail("cbhc@hch");
		b2.setEmpId(124);
		b2.setName("djjkjkfh");
		b2.setSalary(1167111);
		b2.setPassword("cbchhc");

		System.out.println("enter 1 for add");
		System.out.println("enter 2 for delete");
		System.out.println("enter 3 for update");
		System.out.println("enter 4 for retrive");
		System.out.println("******************************************");
		int c = i.nextInt();

		switch (c) {
		case 1:
			System.out.println("adding on...........");
			a.add(b1.getEmpId(), b1);
			a.add(b2.getEmpId(), b2);
			break;
		case 2:
			System.out.println("deleting on.............");
			a.delete(b1.getEmpId());
			break;
		case 3:
			System.out.println("enter gggname");
			break;
		case 4:
			System.out.println("enbgbgbter gggname");
			break;
		default:
			System.out.println("invalid input");

		}

//      a.add(b1.getEmpId(), b1);
//      a.add(b2.getEmpId(), b2);
//       
////      a.delete(b1.getEmpId());
//      a.update(b1.getEmpId(), b1);
//      
//      a.retrive(b1.getEmpId());
//      
//      
//      System.out.println("total salary  = "+b1.getSalary()+" Rs only/-");
//	    
//	    double salhand = salaryInHand( b1.getSalary());
//	    System.out.println("salary in hand of an employee = " +salhand+" Rs only/-");	

	}

}
