package day1;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character:");
		char character=scanner.next().charAt(0);
		int ASCIIValue=(int)character;
		System.out.println("The ASCII value of entered character is : "+ASCIIValue);
	}

}
