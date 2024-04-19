package org.example.codes;
import java.util.Scanner;
public class Conditional
{
    static int empid=100;
	String EmpName;
	public Conditional() 
{
		empid+=1;
	}
		public static void main(String[] args) 
	{	
		System.out.print("Enter Your Employee ID: ");
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1==10 || num1==100)
		{
		
		if(num1==10)
		{
		System.out.println("Congrats!!! You are registered.");
		System.out.println("Your Employee ID is "+num1);
		System.out.print("Enter your name: ");
		String num2=sc.next();
		if (num2.equalsIgnoreCase("Amit"))
		{
			String fst = num2.substring(0, 1).toUpperCase();
			String Name = fst + num2.substring(1).toLowerCase();
			System.out.println("Hi "+ Name+", Welcome to your Dashboard");
			System.out.println("Do you Want to logout?");
			System.out.println("Type Yes to logout/No to continue");
			String logout=sc.next();
			if(logout.equalsIgnoreCase("Yes"))
			{
				System.out.println("You have been successfully logout.");
			}
			else if(logout.equalsIgnoreCase("No"))
				{
				System.out.println("Hi "+ Name+", Welcome to your Dashboard");
				}
			else
			{
				System.out.println("Please select a valid option.");
			}
		}
		else
			System.out.println("Invalid Employee ID or Name ");
		}
		
		else if (num1==100)
		{
		System.out.println("Congrats!!! You are registered.");
		System.out.println("Your Employee ID is "+num1);
		System.out.print("Enter your name: ");
		String num3=sc.next();
		if (num3.equalsIgnoreCase("Anup"))
		{
			String fst = num3.substring(0, 1).toUpperCase();
			String Name = fst + num3.substring(1).toLowerCase();
			System.out.println("Hi "+Name+", Welcome to your Dashboard");
			System.out.println("Do you Want to logout? (Yes/No)");
			String logout=sc.next();
			if(logout.equalsIgnoreCase("Yes"))
			{
				System.out.println("You have been successfully logout.");
			}
			else if(logout.equalsIgnoreCase("No"))
				{
				System.out.println("");
				}
			else
			{
				System.out.println("Please select a valid option.");
			}
		}
		else
			System.out.println("Invalid Employee ID or Name ");
		}}
		else 
		{
			System.out.println("You're not registered. Do you want to register yourself? (Yes/No)");	
			String reg = sc.next();
			if(reg.equalsIgnoreCase("Yes")) 
			{
			Conditional emp1 = new Conditional();
			System.out.print("Enter your name: ");
			emp1.EmpName = sc.next();
			
			String fst = emp1.EmpName.substring(0, 1).toUpperCase();
			String Name = fst + emp1.EmpName.substring(1).toLowerCase(); 
			System.out.println("Congrats "+Name+" !!! You are registered.");
			System.out.println("Your Employee ID is "+(Conditional.empid));
			}	
			else
				System.out.println("You're not registered");
		}
		sc.close();
	}
}