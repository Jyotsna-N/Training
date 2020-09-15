package day3;

import java.util.Scanner;

public class Child extends Parent{
	void Age()
	{
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	 System.out.println(age+10);
	}
	public static void main(String[] args) {
		Parent ch=new Child();
	    ch.Age();
	    ch.PrintData();
	}

}
