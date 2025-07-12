/*[9:47 pm, 09/07/2025] Bhushan Topre Sir Java: ssignment Title: Student Score Analyzer with Exception Handling
🎯 Objective: Build a simple Java program that: Takes student scores as input (from string),
Stores them in an array, Allows lookup by index, Calculates percentage,
And handles various exceptions using multiple catch blocks.🧩 Scenario:
You are creating a Student Score Analyzer tool.
The user will enter 3 subject marks as strings (like "80", "abc", "90").
Convert these strings to integers and store them in an array.
Ask the user to enter an index (0, 1, 2) to fetch one subject's mark.
Calculate and display percentage based on the sum of all marks.
Display length of the score (as a string) using .length().
What to handle using exception blocks:
NumberFormatException: If any input string is not a number
ArithmeticException: If divide-by-zero occurs
ArrayIndexOutOfBoundsException: If an invalid index is given
NullPointerException: If any element in the array is null
Exception: A generic catch block to cover any unexpected errors
[9:48 pm, 09/07/2025] Bhushan Topre Sir Java: Bonus Challenge (Optional ):
After all exceptions are handled, ask the user if they want to re-run the program (Y/N)
Wrap all code in a do-while loop
Use methods for input, validation, and calculation*/
import java.util.*;
class StudentScoreAnalyzerTool
{
public static void main(String args[])
{
	
char choice;
Scanner sc=new Scanner(System.in);

do
{
	try
	{
		System.out.println("Enter 3 subject marks as string ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();

		String[] storeString={a,b,c};	

		int[] marks=new int[3];
		for(int i=0;i<3;i++)
		{
		if(storeString[i]==null)
		{
			   throw new NullPointerException("Null value found");
		}
				marks[i]=Integer.parseInt(storeString[i]);
		}

		
	
	
	System.out.println("Enter an index to view specific subject marks");
	int index=sc.nextInt();
	sc.nextLine();
	
	 System.out.println("Marks at index " + index + ": " + marks[index]);
     System.out.println("Length of score string at index " + index + ": " + storeString[index].length());
	
	int sum=marks[0]+marks[1]+marks[2];
	double percentage=sum/3.0;
	System.out.println(percentage);
	}
	catch(NumberFormatException e)
	{
		System.out.println("Ivalid number please enter a valid number");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Ivalid number : number not divisible by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Ivalid index number please enter a valid index number");
	}
	catch(NullPointerException e)
	{
		System.out.println("Ivalid number element in array is not null");
	}
	catch(Exception e)
	{
		System.out.println("Generic catch block");
	}
	
	System.out.println("Do you want to re-run the program again (Y/N)");
	choice=sc.nextLine().charAt(0);
	
	}
	while(choice=='Y' || choice=='y');
	System.out.println("Thank you for using Student Score Analyzer!");

}
}