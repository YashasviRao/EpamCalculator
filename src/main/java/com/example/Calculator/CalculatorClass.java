package com.example.Calculator;

public class CalculatorClass implements CalculatorInterface {
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public float add(float a,float b)
	{
		return a+b;
	}
	
	public int subtract(int a,int b)
	{
		return a-b;
	}
	
	public float subtract(float a,float b)
	{
		return a-b;
	}
	
	public int multiply (int a,int b)
	{
		return a*b;
	}
	
	public float multiply(float a,float b)
	{
		return a*b;
	}
	
	public int divide(int a,int b)
	{
		if(b!=0)
			return a/b;
		else
		{
			System.out.println("cannot divide by zero");
			return Integer.MIN_VALUE;
		}
	}
	
	public float divide(float a,float b)
	{
		if(b!=0)
			return a/b;
		else
		{
			System.out.println("cannot divide by zero");
			return Integer.MIN_VALUE;
		}
	}
	
}
