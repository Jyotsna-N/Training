package dayy3;

import java.util.Scanner;

public class SortArrayMain {
	public static void main(String[] args)
	{
		int[] array=new int[10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		int[] sortedarray=new int[10];
		SortArray sort=new SortArray();
		sortedarray=sort.sortArray(array);
		System.out.println("Array after sorting");
		for (int i : sortedarray) {
			System.out.println(i);
		}
	}

}
