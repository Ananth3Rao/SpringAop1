package com.mphasis.model;

public class Employee {

	private String name;

	public String getName() {
		System.out.println("getName");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("set name emp");
		//throw new RuntimeException();
	}
	
	
	
}
