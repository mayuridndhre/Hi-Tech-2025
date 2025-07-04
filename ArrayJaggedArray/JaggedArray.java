 //JaggedArray in Java/Raggged Array or Irregular Array
 /*Syntax: - int[][] jaggedArray={
	{3,2,6}
	{7,5}
	{7,3,4,2}
 };
 * datatype[][] arrayname=new datatype[numRows][];
 *Example:- arrayname[0]=new datatype[num Col1];
			arrayname[0]=new datatype[num Col2];*/
			
public class JaggedArray
{
public static void main(String args[])
{
	int[][] ja={
		{3,1,2},
		{9,8},
		{7,4,6,3}
	};
	
	for(int i=0;i<ja.length;i++)
	{
		for(int j=0;j<ja[i].length;j++)
		{
			System.out.print(ja[i][j]+" ");
		}
		System.out.println();
	}
}
}