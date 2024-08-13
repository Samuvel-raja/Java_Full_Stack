package com.wizzgeeks;
class Vehicle
{
	void drive()
	{
		System.out.println("Buy a car");
	}
}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Repairing a car");
	}
}
public class Q2_Vehicle {
 public static void main(String args[])
 {
	 Car c=new Car();
	 c.drive();
 }
}
