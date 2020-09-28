package com.day4;

import java.util.Iterator;
import java.util.Scanner;

public class MainCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select Card 1.MemberShip"+"\n"+"2.PayBack");
		int input=scanner.nextInt();       
			System.out.println("Enter card details:");
			details=scanner.next();	
		    String[] card=details.split("[|]+",3);
		    if(input==1)
		    {
		    System.out.println("Enter the points");
		    int points=scanner.nextInt();
		    System.out.println("Enter Amount");
		    Double amount=scanner.nextDouble();
			PayBack payback=new PayBack(card[0],card[1],card[2],points,amount );
			System.out.println(card[0]+"Card details are:");
			System.out.println("Name:"+payback.getHolderName());
			System.out.println("Points: "+payback.getPointsEarned());
			System.out.println("Total amount: "+payback.getTotalAmount());
		}
		    else
		    {
		    	   System.out.println("Enter rating");
				    int rating=scanner.nextInt();
					MemberShipCard memberShipCard=new MemberShipCard(card[0],card[1],card[2],rating );
					System.out.println(card[0]+"Card details are:");
					System.out.println("Name:"+memberShipCard.getHolderName());
					System.out.println("Card Number: "+memberShipCard.getCardNumber());
					System.out.println("Rating: "+memberShipCard.getRating());
		    }
		    }

}
