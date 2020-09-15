package day1;

public class OddSum {
	public static boolean checkSum(int number)
	{
		int sum=0;
		while(number!=0)
		{
			if((number%10)%2!=0)
			{
				sum=sum+(number%10);
				number=number/10;
			}
			else
			{
				number=number/10;
			}
		}
		if(sum%2!=0)
			return true;
		else
			return false;
		
	}

}
