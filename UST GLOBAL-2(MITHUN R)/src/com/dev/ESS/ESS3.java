package com.dev.ESS;

import java.util.HashMap;



public class ESS3 implements ESS2 {
	HashMap<Integer,ESS1> hm = new HashMap<Integer,ESS1>();

	@Override
	public void add(int key,ESS1 value)
	{
	     hm.put(key, value);

		System.out.println("employee id = "+value.getEmployee_ID());
		System.out.println("employee name = "+value.getEmployee_Name());
		System.out.println("employee email = "+value.getEmail());
		System.out.println("employee password = "+value.getPassword());
		




	}

	@Override
	public void login(ESS1 value) {
		System.out.println("employee email = "+value.getEmail());
		System.out.println("employee password = "+value.getPassword());


	}

	@Override
	public void showRequest(ESS1 value) {
		System.out.println("employee ID = "+value.getEmployee_ID());
		System.out.println("employee leave day = "+value.getLeave_day());
		System.out.println("employee leave status = "+value.getLeave_status());




	}

	@Override
	public void approveRequest(ESS1 value) {
		value.setLeave_status("approved");
		System.out.println("leave status = "+value.getLeave_status());

	}

	@Override
	public void request(ESS1 value) {
		System.out.println("I wanted leave please grant me Employee ID="+value.getEmployee_ID());

	}


}
