package day1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=scanner.nextInt();
		if(number%2==0)
			System.out.println(number+" is a prime number");
		else
			System.out.println(number+" is not a prime number ");
	}

}
