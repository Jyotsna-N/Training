package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RunRate {

	public static void main(String[] args) {
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter runs and overs:");
			float run = Integer.parseInt(bufferedreader.readLine());
			float overs = Integer.parseInt(bufferedreader.readLine());
			System.out.println(run / overs);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
