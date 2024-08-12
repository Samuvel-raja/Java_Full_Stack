package com.wizzgeeks;

public class Dog {
	String name;
	String breed;
	Dog(String name,String breed)
	{
	 this.name=name;
	 this.breed=breed;
	}
	void setName(String name)
	{
		this.name=name;
		
	}
	void setBreed(String breed)
	{
		this.breed=breed;
		
	}
	void display()
	{
		System.out.println(this.name+" "+this.breed);
		
	}
 public static void main(String args[])
 {
	 Dog d1=new Dog("tommy","poppy");
	 Dog d2=new Dog("cutiee","dabbar");
	 System.out.println("Before: ");
	 d1.display();
	 d2.display();
	 System.out.println("After: ");
	 d1.setName("tom");
	 d1.setBreed("Country breed");
	 d1.display();
	 d2.setName("cute");
	 d2.setBreed("American breed");
	 d2.display();
 }
}
