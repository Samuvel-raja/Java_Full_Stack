package com.wizzgeeks;

class Employee_
{
	void work()
	{
		System.out.println("Employee Work");
	}
	void getSalary()
	{
		System.out.println("salary method");
	}
}
class HR_Manager
{
	void work()
	{
		System.out.println("HR Work");
	}
	void addEmployee()
	{
		System.out.println("Adds Employee");
	}
}
public class Q4_Employee {

	public static void main(String[] args) {
		HR_Manager h=new HR_Manager();
		h.work();
		h.addEmployee();

	}

}
