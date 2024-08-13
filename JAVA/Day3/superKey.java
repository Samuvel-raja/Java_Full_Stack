package com.wizzgeeks;
class A
{
	int a=10;
	A(String name)
	{
		System.out.println("Welcome "+name);
	}
	void myMethod1()
	{
		System.out.println("SuperClass Method");
	}
}
class B extends A
{
	B()
	{
		super("Sam");
	}
	void myMethod2()
	{
		System.out.println("SubClass Method " + super.a);
		super.myMethod1();
	}
}
public class superKey {
  public static void main(String args[])
  {
	  B b=new B();
	  b.myMethod2();
	  
  }
}
