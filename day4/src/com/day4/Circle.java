package com.day4;

public class Circle extends shape {
	private String name;
	private int radius;

	Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	Float calculateArea() {

		Float area = (float) (3.14 * radius * radius);
		return area;
	}

}
