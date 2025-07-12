/*Practice Task 1: String to Integer Conversion and Division 🎯 Objective:
Handle both number format and division exceptions.Instructions:
Create two string variables: "100" and "0"
Convert them to integers
Perform division
Use outer try to handle NumberFormatException
Use inner try to handle ArithmeticException*/

class PerformDivTask1
{
public static void main(String args[])
{
String str1="100";
String str2="0";

try
{
int a=Integer.parseInt(str1);
int b=Integer.parseInt(str2);

	try
	{
	int c=a/b;
	System.out.println("Result is : "+c);
	}
	catch(ArithmeticException e)
	{
	System.out.println("O is not divisible by any number");
	}
}
catch(NumberFormatException e)
{
System.out.println("NumberFormatException occurs");
}


}
}