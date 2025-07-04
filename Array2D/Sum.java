/*Task 2: Sum of All Elements in a 2D Array
Objective: Calculate and print the sum of all elements in a 2D array. using 3*2*/

class Sum
{
public static void main(String args[])
{
int x[][]=new int[3][2];
x[0][0]=10;
x[0][1]=5;
x[1][0]=15;
x[1][1]=100;
x[2][0]=5;
x[2][1]=5;


int sum=0;

for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
sum+=x[i][j];
}
}
System.out.println("sum of all elements in the array is :" +sum);
}
}