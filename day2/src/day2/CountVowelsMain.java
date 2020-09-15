package day2;

import java.util.Scanner;

public class CountVowelsMain {
public static void main(String[] args)
{
	// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter string:");
			String string=scanner.nextLine();
			CountVowels countvowel=new CountVowels();
			int count=countvowel.countVowels(string);
			System.out.println("The Count of vowels in a string is "+count);
			
}
}
