/* NameLess Array is called as Anonymous Array
Topic : Anonymous Array*/

public class Anonymous
{
	static void PArray(int a[])
	{
	for(int i=0;i<a.length;i++)
	{
	 System.out.println(a[i]);
	}
	}
	public static void main(String args[])
	{
	PArray(new int[] {33,4,6,19});
	}
} 