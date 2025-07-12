class EHE
{
      public static void main(String args[])
	  {
	        String s=null;
			try
			{
			int length=s.length();
			System.out.println("Length of String is : "+length);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			
			
	  }
}