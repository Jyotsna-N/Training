package dayy3;

import java.util.Scanner;

public class SerachElementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the size of array");
     int size,search,result;
     Scanner scanner = new Scanner(System.in);
     size=scanner.nextInt();
     int[] array=new int[size];
     System.out.println("Enter numbers: ");
     for (int i = 0; i < size; i++) {
    	 array[i]=scanner.nextInt();		
	}
     System.out.println("Enter the element to be serached");
     search=scanner.nextInt();
     SearchElement searchelement=new SearchElement();
     searchelement.searchElement(array,search);     
     
	}

}
