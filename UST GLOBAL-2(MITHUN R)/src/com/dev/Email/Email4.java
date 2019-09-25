package com.dev.Email;

import java.util.HashSet;
import java.util.Scanner;

public class Email4 {





	public static void main(String[] args) {
		HashSet<Account> hm = new HashSet<Account>();
		Scanner sc = new Scanner(System.in);
		Account a = new Account();

		Email3 c = new Email3();
		System.out.println("Welcome to GMAIL APPLICATION");


		int op;
		do {
			System.out.println("enter 2 for login // enter 1 for Register");
			int i = sc.nextInt();
			switch(i)
			{
			case 1 :
				System.out.println("enter id");
				int d = sc.nextInt();
				a.setId(d);
				System.out.println("enter user name");
				String j = sc.next();
				a.setUsername(j);
				System.out.println("enter password");
				String k1 = sc.next();
				a.setPassword(k1);
				System.out.println("enter Email");
				String l = sc.next();
				a.setEmail(l);
				hm.add(a);
				System.out.println(a);
				System.out.println(a.getEmail());
				break;
			case 2 :
				System.out.println("enter Email");
				String email = sc.next();

				System.out.println("enter password");
				String password = sc.next();

				if(email.equalsIgnoreCase(a.getEmail()) && password.equals(a.getPassword()))
				{
					System.out.println("enter A to compose  //B to show Inbox ");
					String a1 = sc.next();
					if(a1.equals("A"))
					{
						c.compose();

					}
					else if(a1.equals("B"))
					{
						c.showInbox();
					}
					else
						System.out.println("invalid input");
				}
				else 
					System.out.println("password is not matching");

				break;
			default :
				System.out.println("invalid input");


			}
			System.out.println("to continue press 1 // press 0 to exit");
			op = sc.nextInt();

		}while(op==1);
		System.out.println("thanks");

	}

}
