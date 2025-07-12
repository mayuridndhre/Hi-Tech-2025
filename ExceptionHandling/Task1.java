/*Task 1: Divide Two Numbers
Objective: Handle division by zero.
Instructions:
Take two numbers as input from the user.
Divide them.
If the denominator is 0, catch the ArithmeticException and display a custom message.*/

import java.util.*;

class Task1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st no : ");
int a=sc.nextInt();

System.out.println("Enter 2nd no : ");
int b=sc.nextInt();

try
{
int c=a/b;
System.out.println("Division is : "+c);
}
catch(Exception e)
{
System.out.println("0 is not divisible by any number ");
}
}
}