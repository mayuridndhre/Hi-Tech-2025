class NestedTryBlock
{
    public static void main(String args[])
	{
	      String strnum1 = "100"; 
		  String strnum2 = "abc"; 
		  try   // Outer Try Block 
		  {
	              int num1 = Integer.parseInt(strnum1); 
				  int num2 = Integer.parseInt(strnum2); 
				  try   // Inner Try Block 
				  {
					   int result = num1 / num2; 
					   System.out.println("REsult :"+result);
				  }
				  catch(ArithmeticException e)
				  {
					    System.out.println("Cannot divide by Zero!");
				  }
		   }catch(NumberFormatException x)
		   {
			    	    System.out.println("String cannot converted into the integer!");
		   }
		   System.out.println("Program or instructions continues after nested try catch block!!");		 
	} 
}