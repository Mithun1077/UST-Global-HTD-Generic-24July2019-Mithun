package com.dev.assesment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//import com.dev.collections.Employee;

public class EmpReg {
	
	static HashSet<Employee_DB> hs=new HashSet<Employee_DB>();
//	static HashMap<Integer, Employee_DB> hm=new HashMap<>();
	static Employee_Info e1=new Employee_Info();
	static Employee_DB e=new Employee_DB();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		EmpReg er=new EmpReg();
		int n;
		do{
		System.out.println("press 1 to register");
		System.out.println("press 2 to login");
		int option=sc.nextInt();
		
		switch(option){
		case 1:
				System.out.println("enter employee id");
				int id=sc.nextInt();
				e.setEmploye_Id(id);
				System.out.println("Enter Employee name");
				String name=sc.next();
				e.setEmployee_Name(name);
				System.out.println("Enter Employee Type");
				String type=sc.next();
				e.setEmployee_Type(type);
				System.out.println("Enter Employee email");
				String email=sc.next();
				e.setEmail(email);
				System.out.println("Enter Employee password");
				String pass=sc.next();
				e.setPassword(pass);
				hs.add(e);
				System.out.println(hs);
				break;
		case 2:
				System.out.println("Enter Id to login");
				int loginid=sc.nextInt();
				
				System.out.println("Enter password");
				String password=sc.next();
				if(e.getEmploye_Id()==loginid && e.getPassword().equals(password))
				{
						if(e.getEmployee_Type().equalsIgnoreCase("manager")){
							System.out.println("1-to show all leave requests  2-approve/reject");
							int m=sc.nextInt();
							if(m==1){
								Emp_Details.display();
							}else if(m==2){
								System.out.println("Enter Employee status");
								String status=sc.next();
								e1.setLeave_status(status);
							}
						}
						else if(e.getEmployee_Type().equalsIgnoreCase("employee")){
							System.out.println("1-status of leave request  2-request for leave");
							int opt=sc.nextInt();
							if(opt==1){
								System.out.println(e1.getLeave_status());
							}
							else if(opt==2){
								
								Emp_Details.req();
							}
						}
					}else {
					System.out.println("invalid user");
				}
		}
		System.out.println("1-repeate 0-exit");
		n=sc.nextInt();
		}while(n==1);
			System.out.println("thanks");
	}
	
}
