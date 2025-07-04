/* 23june Monday Task 2: Reverse a String
Objective: Use reverse() method to reverse a string.
📌 Steps:
Take any word as input (e.g., "DevOps").
Use StringBuffer to reverse the string.
Print the reversed string.*/

import java.util.*;
class Task2
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any word : ");
	String a=sc.nextLine();
	StringBuffer b1=new StringBuffer(a);
	b1.reverse();
	System.out.println(b1);
	
}
}