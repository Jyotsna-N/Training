package com.day5;

import java.util.Scanner;

public class AllException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0,number2=0;
		Scanner scanner=new Scanner(System.in);
		try
		{
			System.out.println("Enter 2 numbers:");
			number1=scanner.nextInt();
			number2=scanner.nextInt();
			System.out.println("Addition of two number is:"+(number1+number2));
		}
		catch(Exception e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
        finally
        {
        	
        }
	}

}
