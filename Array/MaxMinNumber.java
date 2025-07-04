/*Task 2: Find the Maximum and Minimum Number in an Array
Objective:
Given an array of integers, find and print the largest and smallest number.
Example Input:
int[] arr = {15, 6, 23, 4, 17};
Expected Output:
Max = 23, Min = 4*/

class MaxMinNumber
{
public static void main(String args[])
{
int arr[]={15,6,23,4,17};
int max=arr[0];
int min=arr[0];

for(int i:arr)
{
if(i>max)
{
max=i;
}
if(i<min)
{
min=i;
}
}
System.out.println("Max No is : "+max+ " and Min No is : "+min);

}
}