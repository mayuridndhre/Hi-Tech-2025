/*Task 1: Print a 2D Array (Matrix)
Objective: Create and print the elements of a 2D array using 2*3.*/

class Array_2D
{
public static void main(String args[])
{
int x[][]=new int[2][3];
x[0][0]=10;
x[0][1]=5;
x[0][2]=5;
x[1][0]=15;
x[1][1]=105;
x[1][2]=5;

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