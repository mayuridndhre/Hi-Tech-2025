/*Task 4: Null Check with Array Access
Objective:
Practice NullPointerException and ArrayIndexOutOfBoundsException.
Instructions:
Declare a String array with 3 elements, one of which is null.
Ask the user to choose an index and get the string’s length.
Catch:
NullPointerException if value is null.
ArrayIndexOutOfBoundsException if index is invalid.*/

import java.util.*;
class NullTask4
{
public static void main(String args[])
{
String a[]=new String[3];
a[0]="Mayuri";
a[1]=null;
a[2]="Mahi";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of index where you want to store value");
int x=sc.nextInt();
try
{
int length=a[x].length();
System.out.println("Length of index at :"+x+"length is : "+length);
}
catch(NullPointerException e)
{
System.out.println("Error Null pointer exception");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Error ArrayIndexOutOfBoundsException");
}
System.out.println("Program continues");
sc.close();
}
}
