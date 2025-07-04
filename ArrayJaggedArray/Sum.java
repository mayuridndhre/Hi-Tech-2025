/* JaggedArray : - Task 2: Find Sum of Each Row in a Jagged Array
Objective:
Create a jagged array with different column sizes. Print the sum of each row.*/

public class Sum
{
	public static void main(String args[])
		{
			int[][] sum={
				{5,4,3},
				{3,5},
				{2,4,3,7}
			};
			
			System.out.println("Sum of each row");
			for(int i=0;i<sum.length;i++)
			{
				int rowsum=0;
				for(int j=0;j<sum[i].length;j++)
				{
					rowsum+=sum[i][j];
					
				}
				System.out.println(rowsum);
			}
			
		}
}