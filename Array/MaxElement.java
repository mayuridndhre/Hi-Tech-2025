/*Parsing Array to a method in java
Task 2: Find Maximum Element
Objective: Pass an array of integers to a method that returns the maximum value.*/

public class MaxElement
{
	public static void max(int a[])
	 {
	 int max=a[0];
		for(int i:a)
		{
			if(i>max)
			{
			max=i;
			}
		}
		System.out.println(max);
	 }
	 public static void main(String args[])
	 {
	 int a[]={1,2,3,4,5,6,7,8,9};
	 max(a);
	 }
}