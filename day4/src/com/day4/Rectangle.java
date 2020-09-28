package com.day4;

public class Rectangle extends shape {
 private int length,bredth;
 private String name;
 Rectangle(String name,int length,int  bredth)
 {
	 this.name=name;
	 this.length=length;
	 this.bredth=bredth;
 }
	public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getBredth() {
	return bredth;
}

public void setBredth(int bredth) {
	this.bredth = bredth;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	@Override
	Float calculateArea() {
		// TODO Auto-generated method stub
		return (float)length*bredth;
	}
	

}
