/*Task 1: Compare Two Strings Using .equals()
Objective:
Write a Java program that takes two strings from the user and checks whether they are exactly the same (case-sensitive).
🔹 Input: "Java" and "java"
🔹 Output: "Strings are not equal"*/

import java.util.Scanner;

class TwoStrings
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first String");
	String x=sc.nextLine();
	
	System.out.println("Enter second String");
	String x1=sc.nextLine();

System.out.println(x.equals(x1));

sc.close();
}
}