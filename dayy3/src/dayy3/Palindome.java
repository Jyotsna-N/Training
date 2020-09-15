package dayy3;
import java.util.Scanner;
public class Palindome {
	public static void main(String[] args) {
	 String string,reverse="";
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter string:");
	   string=scanner.next();
	   for (int i = string.length()-1; i >=0; i--)
	   {
		reverse=reverse+string.charAt(i);
	   }
	   if(string.equals(reverse))
		   System.out.println(string+ "is a Palindrome");
	   else
		   System.out.println(string+" is not a palindrome");
}
}