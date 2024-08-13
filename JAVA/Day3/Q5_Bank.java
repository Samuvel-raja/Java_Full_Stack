package com.wizzgeeks;

class Bank_Account
{
	double bal=0.0;
	void deposit(double val)
	{
		this.bal+=val;
		System.out.println(" Deposit Success you're Balance is "+this.bal);
	}
	void withdraw(double val)
	{
		if(this.bal!=0)
		{
			this.bal-=val;
			System.out.println("Withdraw Success you're Balance is "+this.bal);
		}
		else
			System.out.println("Don't have sufficient balance");
	}
}
class Savings_Account extends Bank_Account
{

	void withdraw(double val)
	{
		if(this.bal!=0 && this.bal>100)
		{
			this.bal-=val;
			System.out.println("Withdraw Success you're Balance is "+this.bal);
		}
		else
			System.out.println("Balance is less than 100! You can't withdraw");
	}
}
public class Q5_Bank {

	public static void main(String[] args) {
		Savings_Account s=new Savings_Account();
		s.deposit(1500);
		s.withdraw(1400);
		s.withdraw(100);
	}

}
