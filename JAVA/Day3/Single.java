package com.wizzgeeks;
class TwoWheeler
{
	void noOfWheeler()
	{
		System.out.println("I have two wheels");
	}
}
 class Two extends TwoWheeler
{
	void noOfCars()
	{
		System.out.println("I have no cars");
	}
}
 class Three extends TwoWheeler
{
	void noOfCars()
	{
		System.out.println("I have no cars");
	}
}
public class Single extends Two {
	void noOfBikes()
	{
		System.out.println("I have no bikes");
	}

 public static void main(String args[])
 {
	 Two s=new Two();
	 s.noOfWheeler();
     Three s1=new Three();
     s1.noOfWheeler();
 }
}
