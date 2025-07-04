/*Parsing Array to a method in java
Task 1: Sum of Elements
Objective: Pass an integer array to a method and return the sum of its elements.*/

public class Pass_Sum
{
  static int min(int a[])
   {
     int count=0;
     for(int i:a)
     {
        count+=i;
     }
	 return count;
   }

  public static void main(String args[])
  {
    int a[]={1,2,3,4,5};
    int result= min(a);
	System.out.println(result);
  }
}