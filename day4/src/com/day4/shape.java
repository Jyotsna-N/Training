package com.day4;
public abstract class shape {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	abstract Float calculateArea();

}
