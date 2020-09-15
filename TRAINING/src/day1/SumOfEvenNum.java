package day1;
import java.math.*;

public class SumOfEvenNum {
		public static int checkSum(int number)
		{
			int sum=0;
			while(number!=0)
			{
				if((number%10)%2==0)
				{
					int temp=number%10;
					sum=(int) (sum+(Math.pow(temp,2)));
					number=number/10;
				}
				else
				{
					number=number/10;
				}
			}
				return sum;
		}


}
