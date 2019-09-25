package com.dev.ESS;
import java.util.Scanner;

public class ESS4 extends ESS1 {

	public ESS4(int nextInt, String nextLine, String nextLine2, String nextLine3, String nextLine4, String nextLine5) {
		super(nextInt, nextLine, nextLine2, nextLine3, nextLine4, nextLine5);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		ESS3 b = new ESS3();



		System.out.println("enter 1 for register");
		System.out.println("enter 2 for login");
		System.out.println("**********************************");
		
		int c = i.nextInt();

		
//		System.out.println("enter Employee id,name,type,email,password,leave day,leave status");
//
//		ESS1 a2 = new ESS1(i.nextInt(),i.nextLine(),i.nextLine(),i.nextLine(),i.nextLine(),i.nextLine(),i.nextLine());





		switch(c)
		{
		case  1 :
			System.out.println("please register.......");
			System.out.println("enter Employee id,name,type,email,password,leave day");

			ESS1 a1 = new ESS1(i.nextInt(),i.nextLine(),i.nextLine(),i.nextLine(),i.nextLine(),i.nextLine());
			
			b.add(a1);
			break;
		case 2 :
			System.out.println("please login..........");
//			b.login(a1);
			break;

		default :
			System.out.println("invalid............");

		}
		System.out.println("====================================");


//		if(a1.getEmployee_type()=="Manager");
//
//		{
//			System.out.println("welcome to = "+a1.getEmployee_type());
//			System.out.println("enter 1 for showing leave requests");
//			System.out.println("enter 2 for approve the request");
//			int e = i.nextInt();
//			switch(e)
//			{
//			case  1 :
//				System.out.println("showing all the request.......");
//				b.showRequest();
//
//				break;
//			case 2 :
//				System.out.println(" to approve the request.....");
//				b.approveRequest();
//
//				break;
//
//			default :
//				System.out.println("invalid............");
//
//			}
//
//
//		}
//		System.out.println("-------------------------------------------");
//		if(a2.getEmployee_type()=="Employee");
//
//		{
//			System.out.println("welcome to = "+a2.getEmployee_type());
//			System.out.println("enter 1 for showing leave requests");
//			System.out.println("enter 2 for request for a leave");
//			int r = i.nextInt();
//			switch(r)
//			{
//			case  1 :
//				System.out.println("showing all the request.......");
//				b.showRequest(a2);
//
//				break;
//			case 2 :
//				System.out.println(" to request for a leave.....");
//				b.request(a2);
//
//				break;
//
//			default :
//				System.out.println("invalid............");
//
//			}
//
//
//		}





	}

}
