/*Practice Task 2: Insufficient Balance in Bank Account
Objective: Create a custom exception when withdrawal exceeds balance. Instructions:
Set a balance amount (e.g., 5000).
Ask the user to enter withdrawal amount.
If withdrawal > balance, throw InsufficientBalanceException.*/

import java.util.Scanner;
import java.util.InputMismatchException;

class InsufficientBalanceException extends Exception
{
public InsufficientBalanceException(String message)
{
super(message);
}
}
class InsufficientBal
{
public static void main(String args[])
{
	int balance=5000;
	
	Scanner sc=new Scanner(System.in);
	try
	{
	System.out.println("Please Enter withdrawal amount");
	int withdrawalAmt=sc.nextInt();
	
	if(withdrawalAmt>balance)
	{
		throw new InsufficientBalanceException( "Your withdrawal amount must be equal to or less than " + balance);
	}
	else
		System.out.println("Your amount withdrawal successfull availabe balance is : "+(balance-withdrawalAmt));
	}
	catch(InputMismatchException e)
	{
		System.out.println("Error : Please enter a valid amout");
	}
	catch(InsufficientBalanceException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}