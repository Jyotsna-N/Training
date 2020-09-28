package com.day4;

import java.util.Scanner;

public class Calculator implements AdvanceArthmetic {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		Calculator calculator = new Calculator();
		System.out.println(calculator.divisor_sum(input));
	}

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		if (n <= 1000) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					sum = sum + i;
			}
		} else
			System.out.println("Enter number less than 1000");
		return sum;
	}

}
