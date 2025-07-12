/*Practice Task 5: Nested Try for User Login Simulation 🎯 Objective:
Simulate login process using nested exception logic. Instructions:
Outer try: convert user-entered age to integer → NumberFormatException
Inner try: if age is below 18, throw and catch custom exception (e.g., UnderageException)
Print "Login successful" if all passes*/

import java.util.Scanner;
class UnderageException extends Exception
{

public UnderageException(String message)
{
	super(message);
}
}
class UserLogin
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	String ageInput=sc.nextLine();
	try
	{
	int age=Integer.parseInt(ageInput);
		try
		{
		if(age<18)
		{
		throw new UnderageException("You must be 18 or older to login");
		}
		else
		{
		System.out.println("Login successfull!");
		}
		}
		catch(UnderageException e)
		{
		System.out.println(e.getMessage());
		}
	}
	catch(NumberFormatException e)
	{
		System.out.println("Invalid input please enter a valid input");
	}
}
}