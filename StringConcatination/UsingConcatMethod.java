/*Task 2: Concatenate Using concat() Method
Objective: Use the .concat() method to combine two or more strings.
📌 Example:
Input: "Cloud".concat(" Computing")
Output: Cloud Computing*/

import java.util.Scanner;

class UsingConcatMethod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First String");
String str1=sc.nextLine();

System.out.println("Enter the Second String");
String str2=sc.nextLine();


System.out.println(str1.concat(" "+str2));
}
}