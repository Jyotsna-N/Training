package day1;

import java.util.Scanner;

public class OddSumMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		if(OddSum.checkSum(number))
		{
			System.out.println("Sum of odd digits is odd");
		}
		else
			System.out.println("Sum of odd digits of a number is even");

	}

}
