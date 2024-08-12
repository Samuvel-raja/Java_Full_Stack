package com.wizzgeeks;

public class Rectangle {

	float breadth;
	float length;
	Rectangle(float breadth,float length)
	{
		this.breadth=breadth;
		this.length=length;
	}
	void area()
	{
		System.out.println("Area: "+this.length*this.breadth);
	}
	void perimeter()
	{
		System.out.println("Perimeter: "+2*(this.length+this.breadth));
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle(20.28f,29.67f);
        r.area();
        r.perimeter();
	}

}
