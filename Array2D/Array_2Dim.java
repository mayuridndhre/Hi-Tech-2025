/*Task 1: Print a 2D Array (Matrix)
Objective: Create and print the elements of a 2D array.using 2*2*/

import java.util.Scanner;

class Array_2Dim
{
public static void main(String args[])
{
int x[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
System.out.println("Enter input for 2*2 matrix");

for(int i=0;i<x.length;i++)
{
	for(int j=0;j<x[i].length;j++)
	{
		x[i][j]=sc.nextInt();
	}
}
System.out.println("___________");


for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]+ " ");
}
System.out.println();
}
}
}