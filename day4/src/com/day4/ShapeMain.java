package com.day4;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
    System.out.println("Circle"+"\n"+"Square"+"\n"+"Rectangle"+"\n");
    System.out.println("Enter shape");
    Scanner scanner=new Scanner(System.in);
    String input=scanner.next();
    if(input.equals("circle"))
    {
    	System.out.println("Enter radius");
    	int radius=scanner.nextInt();
    	Circle circle=new Circle("Circle",radius);
    	System.out.println(circle.calculateArea());
    }
    if(input.equals("square"))
    {
    	System.out.println("Enter side");
    	int side=scanner.nextInt();
    	Square square=new Square("square",side);
    	System.out.println(square.calculateArea());
    }
    if(input.equals("rectangle"))
    {
    	System.out.println("Enter the length and bredth");
    	int length=scanner.nextInt();
    	int bredth=scanner.nextInt();
    	Rectangle rectangle=new Rectangle("rectangle",length,bredth);
    	System.out.println(rectangle.calculateArea());
    }
	}

}
