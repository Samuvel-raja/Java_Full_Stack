package com.wizzgeeks;

public class MyClass3 {
	static void myMethod()
	{
		System.out.println("Static or Class Method");
	}
	void myMethod2()
	{
		System.out.println("Instance or Object Method");
	}
  public static void main(String args[])
  {
	  MyClass3 m=new MyClass3();
	  myMethod();
	  m.myMethod2();
  }
}
