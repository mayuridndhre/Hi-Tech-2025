/*Task 2: Array Index Handling
Objective: Prevent array access errors.
Instructions:
Create an array of 5 integers.
Try to access an invalid index (e.g., index 10).
Catch and handle ArrayIndexOutOfBoundsException.*/

class Task2
{
public static void main(String args[])
{
int arr[]=new int[5];
try
{
 System.out.println("Accessing index 10: " + arr[10]); // Will throw exception
 System.out.println("Program continues ");
}
catch(Exception e)
{
System.out.println("Array index out of bound");
}
System.out.println(" Program executed safely.");
}
}
