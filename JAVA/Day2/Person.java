package com.wizzgeeks;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}
	
 public static void main(String args[])
 {
	 Person p1=new Person("sam",21);
	 Person p2=new Person("vel",22);

 }
}
