package day1;

import java.util.Scanner;

public class LargestWordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string:");
		String string=scanner.nextLine();
		String largeword=LargestWord.getLargestWord(string);
		System.out.println("Largest Word in string is "+largeword);	
	}

}
