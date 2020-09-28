package com.day5;

import java.util.Arrays;

public class MyException extends Exception{
    String string1;
	MyException(String string)
	{
		string1=string;
	}
	@Override
	public String toString() {
		return string1;
	}
}
