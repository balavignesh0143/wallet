package com.service;

import java.util.Random;
import java.util.Scanner;

import com.bean.UserDetails;
import com.dao.Store;

public class Calculation implements CalculationInter {
	
	Scanner sc = new Scanner(System.in);
	UserDetails ud=new UserDetails();
	Store s=new Store();
	public void createAccount(String name,long mblNo)
	{
		Random r=new Random();
		long accNo=r.nextLong();
		System.out.println("Enter your opening balance: ");
		double balance=validationBal(sc.nextDouble());
		UserDetails ud=new UserDetails(name,mblNo,accNo,balance);
		System.out.println("Account number created : "+accNo);
		s.addDetails(ud);
		System.out.println("User name: "+name);
		System.out.println("User mobile number: "+mblNo);
		System.out.println("New account number: "+accNo);
		System.out.println("Initial balance: "+balance);
	}
	
	public void showBalance() {
		System.out.println("Enter your account number: ");
		long accNo=sc.nextLong();
		if(s.hm().containsKey(accNo))
		{
			ud=(UserDetails)s.hm().get(accNo);
			System.out.println("Your current balance is "+ud.getBalance());
		}
		
	}
	
	public void depositBalance() {
		System.out.println("Enter your account number: ");
		long accNo=sc.nextLong();
		if(s.hm().containsKey(accNo))
		{
			System.out.println("Enter the deposit amount: ");
			double deposit=validationBal(sc.nextDouble());
			UserDetails ud=new UserDetails(deposit,accNo);
			if(s.hm().isEmpty())
			{
				System.out.println("Account exists...");
			}
			else
			{
				if(s.hm().containsKey(ud.getAccNo()))
				{
					double dep=ud.getDeposit();
					double dep1=s.hm().get(ud.getAccNo()).getBalance();
					deposit=dep+dep1;
					System.out.println("Deposited successfully...");
					System.out.println("Your new balance is "+deposit);
				}
				else
				{
					System.out.println("No account....");
				}
			}
			
		}
		
	}
	
public void withdrawBalance() {
	System.out.println("Enter your account number: ");
	long accNo=sc.nextLong();
	if(s.hm().containsKey(accNo))
	{
		System.out.println("Enter the deposit amount: ");
		double deposit=validationBal(sc.nextDouble());
		UserDetails ud=new UserDetails(deposit,accNo);
		if(s.hm().isEmpty())
		{
			System.out.println("Account exists...");
		}
		else
		{
			if(s.hm().containsKey(ud.getAccNo()))
			{
				double dep=ud.getDeposit();
				double dep1=s.hm().get(ud.getAccNo()).getBalance();
				deposit=dep1-dep;
				System.out.println("Deposited successfully...");
				System.out.println("Your new balance is "+deposit);
			}
			else
			{
				System.out.println("No account....");
			}
		}
		
	}
	}
	
	public double validationBal(double balance)
	{
		while(true)
			{
				if(balance<=0)
				{
					System.out.println("Amount is lesser than zero...");
					System.out.println("Enter the amount again: ");
					balance=sc.nextDouble();
				}
				else
				{
					return balance;
				}
		}		
	}
	
	public long validationMblNo(long mblNo)
	{
		while(true)
		{
			if(String.valueOf(mblNo).length()==10)
			{
				return mblNo;
			}
			else
			{
				System.out.println("Enter the valid mobile number: ");
				mblNo=sc.nextLong();
			}
		}
	}

	

	
	

}
