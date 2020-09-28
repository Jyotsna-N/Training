package com.day5;

public class IPLException extends Exception {
    String string2;
	IPLException(String string)
	{
		string2=string;
	}
	@Override
	public String toString() {
		return string2;
	}

}
