package com.day4;

import java.util.Scanner;

public class Stringinput {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();
		java.lang.String[] splitarray=input.split("t");
		System.out.println(splitarray[0]);
		System.out.println(splitarray[1]);
		System.out.println(splitarray[2]);
	}

}
