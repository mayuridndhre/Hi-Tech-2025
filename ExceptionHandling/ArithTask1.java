/*Task 1: Division and Parsing Check Objective:
Handle ArithmeticException and NumberFormatException separately. Instructions:
Take two numbers as string input from the user. Convert them to integers. Perform division (num1 / num2).
Use multiple catch blocks to:Catch if input is not a valid number. Catch if there is a 
divide-by-zero error.*/

import java.util.*;
class ArithTask1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1 : ");
	String a=sc.nextLine();
	
	System.out.println("Enter number 2 : ");
	String b=sc.nextLine();
	try
	{
	int x=Integer.parseInt(a);
	int y=Integer.parseInt(b);
	int result=x/y;
	System.out.println("Result is :"+result);
	}
	catch(NumberFormatException e)
	{
	System.out.println("Error : Enter the integer value only ");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Error : Number not divisible by zero");
	}
	catch(Exception e)
	{
		System.out.println("Exception Occurs ");
	}
	System.out.println("Continue remaining program ");
	
	

}
}


