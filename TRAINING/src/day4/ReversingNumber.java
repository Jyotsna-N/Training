package day4;

public class ReversingNumber {
	int reverse(int number)
	{
		int reverseofanumber=0;
		while(number!=0)
		{
		reverseofanumber=reverseofanumber*10+number%10;
		number=number/10;
		}
		return reverseofanumber;
		}
	void isaPalindrome(int number)
	{
		int reverse=reverse(number);
		if(number==reverse)
			System.out.println("Entered Number is a Palindrome");
		else
			System.out.println("Entered Number is not a palindrome");
	}
	}

