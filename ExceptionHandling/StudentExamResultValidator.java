/*Mini-Assignment: Student Exam Result Validator
🎯 Objective:
Build a program that validates marks entered for a student and throws custom exceptions for invalid marks.
✏️ Instructions:
Create a class InvalidMarksException.
Accept marks for 3 subjects from the user.
If any mark < 0 or > 100, throw the custom exception.
If all are valid, calculate average and print result.
If average < 35, print "You have failed", else "You have passed".*/
import java.util.Scanner;

class InvalidMarksException extends Exception
{
	public InvalidMarksException(String message)
	{
		super(message);
	}
}
class StudentExamResultValidator
{
	public static void main(String args[])
	{
		int total=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the marks for 3 subjects : ");
			int marks[]=new int[3];
		
			for(int i=0;i<3;i++)
			{
			System.out.println("Subject " +(i+1)+ " : ");
			marks[i]=sc.nextInt();
			
			if(marks[i] < 0 || marks[i] > 100)
			{
				throw new InvalidMarksException("Marks must be in between 0 to 100 ");
			}
			total=total+marks[i];	
			}
			double average=total/3.0;
			System.out.println("Average is : "+average);
		
			if(average<35)
			{
			System.out.println("You have failed ");
			}
			else
			System.out.println("You have passed");
		}
		catch(InvalidMarksException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : Please Enter a valid numeric marks ");
		}
	}
}





