/*Task 1: Concatenate Using + Operator
Objective: Take two user input strings and join them using the + operator.
📌 Example:
Input: "Dev" and "Ops"
Output: DevOps*/

import java.util.Scanner;

class UsingPlusOperator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First String");
String str1=sc.nextLine();

System.out.println("Enter the Second String");
String str2=sc.nextLine();

System.out.println(str1+str2);
}
}