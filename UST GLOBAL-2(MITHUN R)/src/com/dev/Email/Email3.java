package com.dev.Email;

import java.util.HashSet;
import java.util.Scanner;

public class Email3 {

	HashSet<Inbox> hm = new HashSet<Inbox>();
	Scanner sc = new Scanner(System.in);
	Inbox b = new Inbox();
	public void compose() {
		System.out.println("enter Email id");
		String n = sc.next();
		b.setEmail(n);

		System.out.println("enter Message");
		String r = sc.next();
		b.setMessage(r);
		hm.add(b);
		System.out.println(b);

	}
	public void showInbox()
	{
		System.out.println("enter Email id to show Inbox");
		String n1 = sc.next();
		System.out.println("message Id = 1");
		System.out.println("hii i love u");
		System.out.println("message Id = 2");
		System.out.println("hii i hate u");

	}

}
