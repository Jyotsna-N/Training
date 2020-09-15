package day1;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		int average=(number1+number2+number3)/3;
		System.out.println("Average of 3 numbers is "+average);
	}

}
