/*Task 4: Null Pointer Exception
Objective: Detect and handle null object access.
Instructions:
Declare a String as null.
Try to find its length.
Handle the NullPointerException and print an appropriate message.*/

class Task3
{
public static void main(String args[])
{
String a=null;

try
{
System.out.println("Length of this String is :"+a.length());
System.out.println(a);
}
catch(Exception e)
{
System.out.println("string is NUll");
}
System.out.println("program continues after exception");
}
}