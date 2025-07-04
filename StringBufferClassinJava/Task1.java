/* 23June Monday
Task 1: Append User Input Strings
Objective: Use append() to join multiple strings.
📌 Steps:
Take three string inputs from the user (e.g., first name, middle name, last name).
Append them using StringBuffer.
Print the full name.*/

import java.util.*;

class Task1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name : ");
	String a=sc.nextLine();
	System.out.println("Enter middle name : ");
	String b=sc.nextLine();
	System.out.println("Enter last name : ");
	String c=sc.nextLine();
	StringBuffer b1=new StringBuffer();
	b1.append(a).append(" ").append(b).append(" ").append(c);
	System.out.println("Your fullname is : "+b1.toString());
	sc.close();
}
}