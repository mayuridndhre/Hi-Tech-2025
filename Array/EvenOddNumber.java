/*Task 3: Count Even and Odd Numbers in an Array
Objective:
Write a program to count how many numbers are even and how many are odd in a given array.
Example Input:
int[] data = {1, 2, 3, 4, 5, 6};
Expected Output:
Even = 3, Odd = 3*/

class EvenOddNumber
{
public static void main(String args[])
{
int data[]={1,2,3,4,5,6};
int even=0;
int odd=0;

for(int i:data)
{
	if(i%2==0)
	{
		even++;
	}
	else
	{
		odd++;
	}
}
System.out.println("Total Even No is : "+even+ " and Total odd No is : "+odd);
}
}