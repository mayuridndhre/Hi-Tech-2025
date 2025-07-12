/*Mini Project: Student Info Formatter
🎯 Objective:
Use String, StringBuffer, and StringBuilder to format student details.
👇 Requirements:
Accept student name, roll number, and department as input.
Use StringBuilder to build a formatted ID like: DEPT-ROLLNO-NAME.
Use StringBuffer to reverse the name and print it.
Display name in different cases using String.*/

import java.util.*;

class MiniProject
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter student Name : ");
String name=sc.nextLine();

System.out.println("Enter Roll No : ");
int rollno=sc.nextInt();

sc.nextLine();
 
System.out.println("Enter Department : ");
String dept=sc.nextLine();

StringBuilder b1=new StringBuilder();
b1.append(dept).append("-").append(rollno).append("-").append(name);
System.out.println(b1);

StringBuffer b2=new StringBuffer(name);
b2.reverse();
System.out.println(b2);

System.out.println("Name in UPPERCASE: " + name.toUpperCase());
System.out.println("Name in lowercase: " + name.toLowerCase());

sc.close();
}
}