package com.mphasis.model;

public class Customer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	//	System.out.println("set name cust");
	}
	
	public String getXXX() {
		return "from getXXX";
	}
	
	public String getXXX(int x) {
		return "from getXXX(int)";
	}
	
	public Integer add(int x, int y) {
		return x+y;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
}
