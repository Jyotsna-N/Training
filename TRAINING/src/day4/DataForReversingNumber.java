package day4;
import java.util.Scanner;

public class DataForReversingNumber {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int input=scanner.nextInt();
		ReversingNumber reverse=new ReversingNumber();
		int result1=reverse.reverse(input);
		System.out.println("The reverse of a Number is: "+ result1);
		reverse.isaPalindrome(input);
		
	}

}
