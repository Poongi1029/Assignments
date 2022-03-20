package com.springboot.assignmnet6;

@org.springframework.stereotype.Service
public class Service {
	
	public int Addition(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of a+b is:"+c);
		return c;
		
		
	}
	public int Subtraction(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtarction of a-b is:"+c);
		return c;
	}
	public int Multiplication(int a,int b)
	{
		int c=a*b;
		System.out.println("Multipliacation of a*b is:"+c);
		return c;
	}
	public int division(int a, int b)
	{
		int c=a/b;
		System.out.println("Division of a/b is:"+c);
		return c;
	}

}
