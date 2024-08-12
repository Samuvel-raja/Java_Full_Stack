package com.wizzgeeks;
class Employee
{
	int empId;
	String empName;
	float empSalary;
	Employee(int empId,String empName,float empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	void display()
	{
		System.out.print(empId+" ");
		System.out.print(empName+" ");
		System.out.print(empSalary);
		System.out.println();
	}
}

public class MyClass {

	public static void main(String[] args) {

	Employee e1=new Employee(10,"sam",829.302f);
    Employee e2=new Employee(14,"sam",6729.302f);
   
    e1.display();
    e2.display();

}
}
