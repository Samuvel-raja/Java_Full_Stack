package com.wizzgeeks;
import java.util.*;
class Student
{
	int regNo;
	String stName;
	int marks[]=new int[5];
	Student(int a,String b)
	{
		regNo=a;
		stName=b;
	}
	void getMarks()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
			this.marks[i]=s.nextInt();
	}
	void displayGrade()
	{
		int sum=0;
		for(int i=0;i<5;i++)
			sum+=this.marks[i];
		int avg=sum/5;
		System.out.println("Regno: "+this.regNo);
		System.out.println("Name: "+this.stName);
		System.out.println("Total: "+sum);
		System.out.print("Grade: ");
		if(avg>70)
			System.out.println("A");
		else if(avg<70 && avg>50)
			System.out.println("B");
		else
			System.out.println("C");
		
		
	}
}
public class MyClass6 {

public static void main(String args[])
 {
	Student m=new Student(5,"sam");
	m.getMarks();
	m.displayGrade();
	 
 }
}
