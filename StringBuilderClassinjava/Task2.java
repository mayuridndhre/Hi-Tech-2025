/* 3 July Thursday Task 2: Reverse a String
Objective: Use reverse() method to reverse a string.
📌 Steps:
Take any word as input (e.g., "DevOps").
Use StringBuilder to reverse the string.
Print the reversed string.*/

import java.util.*;
class Task2
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any word : ");
	String a=sc.nextLine();
	StringBuilder b1=new StringBuilder(a);
	b1.reverse();
	System.out.println(b1);
	
}
}