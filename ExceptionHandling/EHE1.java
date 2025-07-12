class EHE1
{
      public static void main(String args[])
	  {
	       String s1="abc";
			try
			{
				int num=Integer.parseInt(s1);
				System.out.println("Parse no is :"+num);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("Unable to parse String as an Integer");
			}
			
			
	  }
}