package com.wizzgeeks;

public class MyClass5 {
	void myMethod(String name)
	{
		System.out.println("hii");
	}
	void myMethod(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		System.out.println(f);
	}
	void myMethod(int a,int b)
	{
		System.out.println(a+b);
	}
 public static void main(String args[])
 {
	 MyClass5 m=new MyClass5();
	 m.myMethod("sam");
	 m.myMethod(5);
	 m.myMethod(10,39);
 }
}
