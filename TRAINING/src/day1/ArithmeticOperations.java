package day1;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int addition=number1+number2;
		int subtraction=number1-number2;
		int multiplication=number1*number2;
		int division=number1/number2;
		int remainder=number1%number2;
		System.out.println("Addition of 2 numbers is:"+addition);
		System.out.println("Addition of 2 numbers is:"+subtraction);
		System.out.println("Addition of 2 numbers is:"+multiplication);
		System.out.println("Addition of 2 numbers is:"+division);
		System.out.println("Addition of 2 numbers is:"+remainder);
	}
}
