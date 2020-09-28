package com.day5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int number1,number2;
		Scanner scanner=new Scanner(System.in);
	
		try
		{
			while(true) {
			System.out.println("Enter 2 numbers");
			number1=scanner.nextInt();
			number2=scanner.nextInt();
			if(number1==0||number2==0)
			{
				throw new MyException("Numbers cannot be negative");
			}
			if(number1<0)
			{
				throw new MyException("First Number entered is negative");
			}
			if(number2<0)
			{
				throw new MyException("Second Number entered is negative");
			}
			else
			{
				System.out.println(Math.pow(number1, number1));
			}
		}}
		catch(MyException e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}

}
}