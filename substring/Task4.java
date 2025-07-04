/*4. trim() – Remove Spaces
🔹 Task Ideas:
Remove spaces from " Hello World " and show the cleaned string.
Count how many spaces were trimmed from " Mayuri " using length().
Accept a string with leading/trailing spaces and use trim() before processing.
Take user input " Password123 " → Apply trim() → Validate against "Password123".
Combine trim() with toUpperCase() to clean and standardize user input.*/

import java.util.*;

class Task4
{
public static void main(String args[])
{
//1
String s=" Hello World ";
System.out.println(s.trim());
System.out.println("----------------");

//2
String s1="   Mayuri   ";
int before=s1.length();
int after=s1.trim().length();
int result=before-after;
System.out.println(result);
System.out.println("----------------");

//3
Scanner sc=new Scanner(System.in);
System.out.println("Enter any word :");
String word=sc.nextLine();
System.out.println("after trim :"+word.trim());
System.out.println("----------------");

//4
System.out.println("Enter any password :");
String pass=sc.nextLine();
if(pass.trim().equals("Password123"))
{
	System.out.println("correct password");
}
else
{
	System.out.println("Incorrect password");
}
System.out.println("----------------");

//5
System.out.println("Enter user input");
String a1=sc.nextLine();
System.out.println(a1.trim().toUpperCase());
System.out.println("----------------");
}
}