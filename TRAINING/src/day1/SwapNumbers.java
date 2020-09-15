package day1;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int dummy;
		dummy=number1;
		number1=number2;
		number2=dummy;
		System.out.println("Numbers after Swapping are :"+number1+"\n"+number2);
	}

}
