class thisDemo
{
      thisDemo()
	  {
	      System.out.println("Current class Current instance/obejct is "+this);
	  }
     public static void main(String args[])
	 {
		   thisDemo o2 = new thisDemo(); 
	       thisDemo o1 = new thisDemo(); 
		   thisDemo o3 = new thisDemo();	
	 }
}