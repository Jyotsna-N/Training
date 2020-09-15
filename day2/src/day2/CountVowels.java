package day2;

public class CountVowels {
	int countVowels(String string) {
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
					|| character == 'A' || character == 'E' || character == 'I' || character == 'O'
					|| character == 'U') {
				sum = sum + 1;
			}
		}
		return sum;

	}

}
