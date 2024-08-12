package com.wizzgeeks;

public class Circle {
     float radius;
     Circle(float radius)
     {
    	 this.radius=radius;
     }
     void area()
     {
    	 System.out.println("Area: "+this.radius*this.radius);
     }
     void perimeter()
     {
    	 System.out.println("Perimeter: "+2*3.14*this.radius);
     }
	public static void main(String[] args)
	{

       Circle c=new Circle(25.28f);
       c.area();
       c.perimeter();
	}

}
