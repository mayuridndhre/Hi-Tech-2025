//Autoboxing
public class WrapperEx1
{
	public static void main(String args[])
	{
		int a=20;
		Integer i=Integer.valueOf(a);  //converting int into Integer Explicitly
		Integer j=a;  //autoboxing,now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+"  "+i+"  "+j);
	}
}
