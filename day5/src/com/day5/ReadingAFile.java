package com.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader filereader = null;
		try {
			filereader = new FileReader("C:\\Software\\anyfolder\\abc.txt");
			int temp = filereader.read();
			while (temp != -1) {
				System.out.print((char) temp);
				temp = filereader.read();

			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

	}

}
