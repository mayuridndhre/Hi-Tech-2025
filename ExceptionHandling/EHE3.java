class EHE3
{
      public static void main(String args[])
	  {
	       
			try
			{
			
				int a[]=new int[5];
				a[5]=30/0;
				
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				
				System.out.println("ArrayIndexOutOfBoundsException occured");
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("ArithmaticException occured");
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
			}
			
			System.out.println("Remaining code");
			
			
	  }
}