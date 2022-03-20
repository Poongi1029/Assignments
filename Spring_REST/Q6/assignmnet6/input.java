package com.springboot.assignmnet6;

public class input {

	int a;
	int b;
	public input(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public input() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "input [a=" + a + ", b=" + b + "]";
	}
	
}
