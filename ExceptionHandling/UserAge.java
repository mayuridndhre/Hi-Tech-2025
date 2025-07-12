/*Practice Task 1: Underage Voting Exception
Objective: Create a custom exception for users under 18 trying to vote.
Instructions:
Ask the user to enter age.
If age < 18, throw UnderageVoterException.
Else, print “You are eligible to vote.”*/
import java.util.Scanner;
import java.util.InputMismatchException;
class UnderVotingException extends Exception
{
public UnderVotingException(String message)
{
super(message);
}
}

class UserAge
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter age");
		int age=sc.nextInt();
	
		if(age<18)
		{
		throw new UnderVotingException("you must be 18 or greater than 18 ");
		}
		else
		{
		System.out.println("You are eligible to vote");
		}
	}
	catch(InputMismatchException e)
	{
	System.out.println("Please enter a valid number");
	}
	catch(UnderVotingException e)
	{
    System.out.println(e.getMessage());
    }
}
}