package com.ui;

import java.util.Scanner;

import com.service.Calculation;

public class BankWallet {
	public int getOption(Scanner sc)
	{
		try
		{
			int option=sc.nextInt();
			return option;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return -1;
		}
	}
	public static void main(String[] args) {
		int option;
		Scanner sc=new Scanner(System.in);
		Calculation c=new Calculation();
		do
		{
			System.out.println("\t\t\t\tXYZ BANK WALLET");
			System.out.println("\n1)Create Account...");
			System.out.println("2)Show Balance...");
			System.out.println("3)Deposit...");
			System.out.println("4)Withdraw...");
			System.out.println("5)Fund Transfer...");
			System.out.println("6)Print Transaction...");
			System.out.println("7)Exit...");
			System.out.println("Enter your option: ");
			option=sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter your name:");
				String name=sc.next();
				System.out.println("Enter your mobile number:");
				long mblNo=c.validationMblNo(sc.nextLong());
				c.createAccount(name,mblNo);
				break;
			case 2:
				c.showBalance();
				break;
			case 3:
				c.depositBalance();
				break;
			case 4:
				c.withdrawBalance();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.out.println("Thank for using our service!!!");
				System.out.println("Regards\nXYZ BANK WALLET...");
				break;
			default:
				System.out.println("");
				break;
			}
		}while(option!=7);
		sc.close();
	}
}
