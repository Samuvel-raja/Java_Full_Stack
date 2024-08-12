package com.wizzgeeks;

public class MyClass4 {
	String name;
	  MyClass4(String name)
	  {
		  this(10,20);
		  this.name=name;
		  this.greeting();
	  }
	  MyClass4(int a,int b)
	  {
		  System.out.println(a+" "+b);
	  }
	  void greeting()
	  {
		  System.out.println("Good morning "+ name);
	  }
  public static void main(String args[])
  {
	 MyClass4 m=new MyClass4("sam");
	
  }
}
