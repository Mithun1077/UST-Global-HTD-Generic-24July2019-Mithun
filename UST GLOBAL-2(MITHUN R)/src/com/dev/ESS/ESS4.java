package com.dev.ESS;
import java.util.Scanner;

public class ESS4 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		ESS3 b = new ESS3();

	

		System.out.println("enter 1 for register");
		System.out.println("enter 2 for login");
		System.out.println("**********************************");
		int c = i.nextInt();
		
		ESS1 a1 = new ESS1();
		a1.setEmployee_ID(100);
		a1.setEmployee_Name("Mithun");
		a1.setEmail("mithunias10@gmail.com");
		a1.setPassword("123123123");
		a1.setEmployee_type("Manager");


		ESS1 a2 = new ESS1();
		a2.setEmployee_ID(101);
		a2.setEmployee_Name("Nithin");
		a2.setEmail("nithin@123");
		a2.setPassword("1231");
		a2.setEmployee_type("Employee");
		a2.setLeave_day("Monday");
		a2.setLeave_status("pending");
		

		

		switch(c)
		{
		case  1 :
			System.out.println("please registered.......");
			b.add(a2.getEmployee_ID(),a2);
			break;
		case 2 :
			System.out.println("please login..........");
			b.login(a2);
			break;

		default :
			System.out.println("invalid............");

		}
		System.out.println("====================================");


		if(a1.getEmployee_type()=="Manager");

		{
			System.out.println("welcome to = "+a1.getEmployee_type());
			System.out.println("enter 1 for showing leave requests");
			System.out.println("enter 2 for approve the request");
			int e = i.nextInt();
			switch(e)
			{
			case  1 :
				System.out.println("showing all the request.......");
				b.showRequest(a2);

				break;
			case 2 :
				System.out.println(" to approve the request.....");
				b.approveRequest(a2);

				break;

			default :
				System.out.println("invalid............");

			}


		}
		System.out.println("-------------------------------------------");
		if(a2.getEmployee_type()=="Employee");

		{
			System.out.println("welcome to = "+a2.getEmployee_type());
			System.out.println("enter 1 for showing leave requests");
			System.out.println("enter 2 for request for a leave");
			int r = i.nextInt();
			switch(r)
			{
			case  1 :
				System.out.println("showing all the request.......");
				b.showRequest(a2);

				break;
			case 2 :
				System.out.println(" to request for a leave.....");
				b.request(a2);

				break;

			default :
				System.out.println("invalid............");

			}


		}





	}

}
