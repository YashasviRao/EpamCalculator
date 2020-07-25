package com.example.Calculator;

import java.io.*;
import java.util.*;

public class Calculator {

	public static void main(String args[])
	{
		CalculatorClass cc = new CalculatorClass();
		
		Scanner sc=new Scanner(System.in);
		char ch;
		
		System.out.println("Enter choice");
	 try
	  {
		while(true)
		{
			System.out.println("1.add");
			System.out.println("2.subtract");
			System.out.println("3.multiply");
			System.out.println("4.divide");
			
			System.out.println("enter option");
			
			 int x=sc.nextInt();
			
			
			System.out.println("Enter first number");
			int a=sc.nextInt();
			
			System.out.println("Enter second number");
			int b=sc.nextInt();
		
			switch(x)
			{
				case 1:System.out.println("Addition is " + cc.add(a,b));break;
				case 2:System.out.println("subtraction is " + cc.subtract(a,b));break;
				case 3:System.out.println("multiplication is " + cc.multiply(a,b));break;
				case 4:System.out.println("division is " + cc.divide(a,b));break;
				default:System.out.println("enter a valid input");break;
			}
			System.out.println("do you want to perform another operation:(Y|N)");
			
			ch=sc.next().charAt(0);
			if(ch!='y' || ch!='Y')
				break;	
		}
	  }
	 catch(InputMismatchException e)
		{
			System.out.println("Enter a valid numeric input");
		}
		
	}
}


