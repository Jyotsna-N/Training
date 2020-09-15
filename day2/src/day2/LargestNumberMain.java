package day2;

import java.util.Scanner;

public class LargestNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
        LargestNumber largestnumber=new LargestNumber();
       int large= largestnumber.largestNumber(number1, number2, number3);
       System.out.println("Largest Number is: "+large);
	}

}
