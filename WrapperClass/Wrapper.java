//Unboxing[Object to primitive]
class Wrapper
{
	public static void main(String args[])
	{
		Integer a=Integer.valueOf(3);
		int i=a.intValue();  //Converting Integer to int explicitly
		int j=a;  //Unboxing,now compiler will write a.intValue() internally
		
		System.out.println(a+"  "+i+"  "+j);
	}
}