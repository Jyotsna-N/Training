package dayy3;

import java.util.Scanner;

public class Panagram {
		public static void main(String[] args)
		{
		 String string;
		 int index=0,flag=0;
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter string:");
		   string=scanner.nextLine();
		   int[] alphaflag=new int[26];
		 for(int i=0;i<string.length();i++)
		 {
			 if((string.charAt(i)>='a'&&string.charAt(i)<='z'))
			 {
				 index=string.charAt(i)-'a';
			 }
			 else if((string.charAt(i)>='A'&&string.charAt(i)<='Z'))
			 {
				 index=string.charAt(i)-'A';
			 }
			 alphaflag[index]=1;
		 }
		 for (int i = 0; i < alphaflag.length; i++) {
			if(alphaflag[i]>=1)
				flag=0;
			else
				flag=1;
		}
		 if(flag==1)
			 System.out.println("Not a panagram");
		 else
			 System.out.println("Panagaram");
		}
	}

