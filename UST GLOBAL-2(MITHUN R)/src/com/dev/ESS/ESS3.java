package com.dev.ESS;


import java.util.ArrayList;




public class ESS3 implements ESS2 {
	ArrayList<ESS1> hm = new ArrayList<ESS1>();

	@Override
	public void add(ESS1 value)
	{
		
		hm.add(value);
		System.out.println(hm.add(value));
		System.out.println(hm.get(0));
		System.out.println(hm);






	}

	@Override
	public void login(ESS1 value) {



	}

	@Override
	public void showRequest(ESS1 value) {





	}

	@Override
	public void approveRequest(ESS1 value) {


	}

	@Override
	public void request(ESS1 value) {


	}


}
