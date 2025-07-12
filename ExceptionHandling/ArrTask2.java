/*ask 2: Array Access and String Parsing Objective:Practice catching ArrayIndexOutOfBoundsException and NumberFormatException.
Instructions Declare an integer array of size 5. Ask the user for an index and a string to convert to an integer.
Try to access the array at that index and convert the string. Use multiple catch blocks to handle: 
Array out-of-bound access.
Number format issue.*/

import java.util.*;
class ArrTask2
{
public static void main(String args[])
{
int a[]=new int[5];

Scanner sc=new Scanner(System.in);


System.out.println("ENter the index where you want to store the value at 0to4");
int x=sc.nextInt();
sc.nextLine();

System.out.println("Enter the String value which you want to store");
String value=sc.nextLine();

try
{
int val=Integer.parseInt(value);
a[x]=val;
System.out.println("Value : "+value+" Store at index : "+x);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Error Invalid index ");
}
catch(NumberFormatException e)
{
	System.out.println("Error Please enter a valid number");
}
System.out.println("Remaining program continues");
sc.close();

}
}