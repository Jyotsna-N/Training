package day1;

import java.util.Scanner;

public class SumOfEvenMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int evensum=SumOfEvenNum.checkSum(number);
		System.out.println("Sum of squares of even numbers in a number is: "+evensum);
			
	}


}
