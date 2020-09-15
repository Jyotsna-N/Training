package dayy3;

import java.util.Scanner;

public class PrintSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
	   int startIndex,endIndex;
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter string:");
	   string=scanner.next();
	   System.out.println("Enter starting index and end end of substring");
	   startIndex=scanner.nextInt();
	   endIndex=scanner.nextInt();
	   String subString=string.substring(startIndex-1, endIndex-1);
	   System.out.println("The substring is "+subString);
	}

}
