package com.wizzgeeks;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal class");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat class");
	}
}
public class Q1_Animal {

	public static void main(String[] args) {

       Cat m=new Cat();
       m.makeSound();
	}

}
