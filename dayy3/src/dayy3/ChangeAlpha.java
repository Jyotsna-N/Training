package dayy3;

import java.util.Scanner;

public class ChangeAlpha 
{
	public static void main(String[] args)
	{
		String string,replacedstring;
		System.out.println("Enter string");
		Scanner scanner=new Scanner(System.in);
		string=scanner.nextLine();
		replacedstring=string.replace('h', 'j');
		System.out.println("The string after replacing h with j is "+replacedstring);
	    	
	}
}
