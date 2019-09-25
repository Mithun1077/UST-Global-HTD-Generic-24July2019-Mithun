package com.dev.assesment;

import java.util.Scanner;
import java.util.HashSet;

public class Emp_Details{

	static Scanner sc=new Scanner(System.in);
	static HashSet<Employee_Info> hs=new HashSet<Employee_Info>();
	static Employee_Info e1=new Employee_Info();
	public static void main(String[] args) {
		
		
	}
	public static void display(){
		Employee_Info e=new Employee_Info();
		e.setEmployee_Id(100);
		e.setLeaveDate("25/08/2019");
		e.setLeave_status("pending");
		
		Employee_Info e1=new Employee_Info();
		e1.setEmployee_Id(101);
		e1.setLeaveDate("12/08/2019");
		e1.setLeave_status("Approve");
		
		Employee_Info e2=new Employee_Info();
		e2.setEmployee_Id(102);
		e2.setLeaveDate("9/08/2019");
		e2.setLeave_status("Reject");
		hs.add(e);
		hs.add(e1);
		hs.add(e2);
		
		System.out.println(hs);
	}
	public static void req(){
		System.out.println("Request for leave");
		System.out.println("Enter id");
		int reqId=sc.nextInt();
		e1.setEmployee_Id(reqId);
		System.out.println("enter date");
		String reqDatae=sc.next();
		e1.setLeaveDate(reqDatae);
		System.out.println("Request sent");
	}

}
