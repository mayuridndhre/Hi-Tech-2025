/*Practice Task 3: Null String Length and Parsing 🎯 Objective:
Handle null reference and parsing issue. Instructions:
Declare a string variable: String value = null;
Use outer try to get value.length() → may throw NullPointerException
Use inner try to convert that value to int → may throw NumberFormatException*/

class NullStrTask3
{
public static void main(String args[])
{
String value=null;

try
{
int a=value.length();
System.out.println("Length of value is : "+a);

	try
	{
	int z=Integer.parseInt(value);
	System.out.println("Parsed value is : "+z);
	}
	catch(NumberFormatException e)
	{
	System.out.println("Number format exception occurs");
	}
}
catch(NullPointerException e)
{
System.out.println("NullPointerException occurs");
}
}
}