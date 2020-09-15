package day2;

import java.util.Scanner;

public class MiddleCharMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string:");
		String string=scanner.next();
		MiddleChar middlecharobj=new MiddleChar();
		char middlechar=middlecharobj.middleCharacter(string);
		System.out.println("Largest Word in string is "+middlechar);	
	}



}
