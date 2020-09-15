package day1;

public class LargestWord {
	public static String getLargestWord(String line)
	{
		String[] words=line.split(" ");
		String longword="";
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>longword.length())
				longword=words[i];
		}
		return longword;
	}
}
