/*Practice Task 2: Array Access with Division🎯 Objective:
Work with array and math operations together.Instructions:
Declare an array int[] numbers = {10, 20, 0};
Use outer try to catch ArrayIndexOutOfBoundsException
Use inner try to divide a number by the element at given index
Catch ArithmeticException inside the inner block*/
import java.util.*;

class ArrayTask2
{
public static void main(String args[])
{
int[] numbers={10,20,0};
Scanner sc=new Scanner(System.in);

try
{
System.out.println("Enter a index no");
int index=sc.nextInt();
System.out.println("You choose a Indexno "+index+ " on that value is "+numbers[index]);

	try
	{
		int divide=20/numbers[index];
		System.out.println("Result of " +numbers[index]+ " is " +divide);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Not divide by same no");
	}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException: Please enter valid index number between 0-2");
}
}
}