package dayy3;

import java.util.Scanner;

public class SubStringChar {
public static void main(String[] args)
{
	String input,output="";
	Scanner scanner=new Scanner(System.in);
	input=scanner.next();
	if(input.charAt(0)=='k')
		output=output+input.charAt(0);
	if(input.charAt(1)=='l')
		output=output+input.charAt(1);
	for(int i=2;i<input.length();i++) 
	{
	output=output+input.charAt(i);
	}
	System.out.println("String after manipulation is:"+output);
}
}
