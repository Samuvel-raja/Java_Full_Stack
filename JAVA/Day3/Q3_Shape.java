package com.wizzgeeks;

class Shape
{
	void getArea()
	{
		System.out.println("Common shape");
	}
}
class Rect extends Shape
{
	void getArea(double a,double b)
	{
		System.out.println("Area of Rectangle: "+a*b);
	}
}
public class Q3_Shape {

	public static void main(String[] args) {
		Rect r=new Rect();
		r.getArea(20.3,89.3);;

	}

}
