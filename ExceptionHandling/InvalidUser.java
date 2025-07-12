/*Practice Task 3: Invalid Username Exception
Objective: Throw exception if username is less than 5 characters.
Instructions:
Ask the user for a username.
If username.length() < 5, throw InvalidUsernameException.*/
import java.util.Scanner;

class InvalidUsernameException extends Exception
{
public InvalidUsernameException(String message)
{
super(message);
}
}
class InvalidUser
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try
	{
	System.out.println("Enter username");
	String username=sc.nextLine();
	
	if(username.length()<5)
	{
	throw new InvalidUsernameException("Length of username must be equals to 5 characters or above ");
	}
	else
	System.out.println("Valid Username successfull");
	}
	catch(InvalidUsernameException e)
	{
	System.out.println(e.getMessage());
	}
}
}