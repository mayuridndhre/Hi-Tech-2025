/*Anonymous Array
Task 1: Print Squares of Elements
Objective: Call a method with an anonymous array of integers that prints square of each element.*/

public class Anonymous_Square
{
 static void Square(int a[])
 {
	for(int i:a)
	{
	 System.out.println(i + " squared = " + (i * i));
	}

 }
 public static void main(String args[])
 {
 Square(new int[] {1,2,3,4,5});
 }
}
