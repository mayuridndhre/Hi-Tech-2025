/*Task 3: Find Maximum Element in a 2D Array
Objective: Find and print the maximum value in a 2D array. using 3*3*/

class Maximum
{
	public static void main(String args[])
	{
		int x[][]={
			{10,5,6},
			{15,101,200},
			{4,6,10}
		};
		
		int max=x[0][0];
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]>max)
				{
				max=x[i][j];
				}
			}
		}
		System.out.println("Maximum element in the array is :" +max);
		
	}
}