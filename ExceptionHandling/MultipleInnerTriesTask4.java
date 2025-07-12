/*Practice Task 4: Multiple Inner Tries for Different Operations 🎯 Objective:
Use two inner try blocks for different logic under one outer block. Instructions:
Outer try: handles NumberFormatException
Inner try 1: divide two integers, handle ArithmeticException
Inner try 2: access invalid array index, handle ArrayIndexOutOfBoundsException*/
import java.util.*;
class MultipleInnerTriesTask4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a first no");
String num1=sc.nextLine();
System.out.println("Enter a second no");
String num2=sc.nextLine();


try
{
int a=Integer.parseInt(num1);
int b=Integer.parseInt(num2);
	try //Inner try block1
	{
	int divide=a/b;
	System.out.println("Division is : "+divide);
	}
	catch(ArithmeticException e)
	{
	System.out.println("ArithmeticException occurs Zero not divisible by any number ");
	}
	
	try //Inner try block2
	{
	int arr[]={10,20,30};
	System.out.println("Enter index no Accessing element : ");
	int access=sc.nextInt();
	System.out.println(arr[access]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("ArrayIndexOutOfBoundsException occurs");
	}
}
catch(NumberFormatException e)
{
System.out.println("NumberFormatException occurs");
}
}
}

