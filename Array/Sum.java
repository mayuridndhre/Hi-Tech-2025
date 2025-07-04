/*Task 1: Find the Sum of All Elements in an Array
Objective:
Write a Java program that declares an integer array and calculates the sum of all elements.
Example Input:
int[] numbers = {10, 20, 30, 40, 50};
Expected Output:
Sum = 150*/
class Sum
{
	public static void main(String args[])
	{
	int numbers[]={10,20,30,40,50};
	int sum=0;
	
	for(int i:numbers)
	{
	sum+=i;
	}
	System.out.println("Sum is : "+sum);
	}
}
