package com.day4;

public class Square extends shape {
	private String name;
	private int side;

	Square(String name, int side) {
		this.name = name;
		this.side = side;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	Float calculateArea() {
		// TODO Auto-generated method stub
		return (float) (side * side);
	}

}
