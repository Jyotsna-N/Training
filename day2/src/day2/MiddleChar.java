package day2;

public class MiddleChar {
public char middleCharacter(String string)
{
	char middlechar;
	if(string.length()%2!=0)
	{
		middlechar=string.charAt(string.length()/2);
	}
	else
	{
		middlechar=string.charAt(string.length()/2-1);
	}
	return middlechar;
}
}
