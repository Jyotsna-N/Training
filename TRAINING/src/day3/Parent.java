package day3;

import java.util.Scanner;

public class Parent {

	void PrintData()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name:");
	String name=new String();
	name=sc.next();
	System.out.println("WELCOME!"+name);
	}
	void Age()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age=scr.nextInt();
		System.out.println("AGE : "+age);

	}
}
