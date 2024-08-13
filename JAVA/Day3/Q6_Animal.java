package com.wizzgeeks;

class Animall
{
	void move()
	{
		System.out.println("Animal ready to move");
	}
}
class Cheetah extends Animall
{
	void move()
	{
		System.out.println("Cheetah moves");
	}
}
public class Q6_Animal {

	public static void main(String[] args) {
Cheetah c=new Cheetah();
c.move();
	}

}
