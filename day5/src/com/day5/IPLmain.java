package com.day5;

import java.util.Scanner;

public class IPLmain {

	public static void main(String[] args) throws IPLException {
		int age;
		String name;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter age");
			age = scanner.nextInt();
			if (age <= 19) {

				throw new IPLException("Invalid Age");
			} else {
				IPLValidation ipl = new IPLValidation(name, age);
				System.out.println("Name:" + ipl.getName());
				System.out.println("Age:" + ipl.getAge());
			}
		} catch (IPLException e) {
			System.out.println(e);
		} finally {

		}

	}
}
