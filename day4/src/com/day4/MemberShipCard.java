package com.day4;

public class MemberShipCard extends Card{
	private int rating;
	public MemberShipCard(String holderName, String cardNumber, String expiryDate,int rating) {
		super(holderName, cardNumber, expiryDate);
		this.setRating(rating);
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}


	

}
