/* Static Keyword in Java */ 
/* 
static is nothing but the keyword in java which is used for memory management.
To define members that belongs to the class rather than an instance (object) of the class.  
It can be applied variables, methods, blocks and nested classes. 
*/
// 1. Static Variables 
// 1. Static variable is initalized only once 2. Static variable is not initialized then by default it will 0. 
class Demo
{
     static int count; 
	 void execute()
	 {
	      count ++; // count = count+ 1; 
	 }
	 void displayCount()
	 {
	     System.out.println("Count is : "+count);
	 }
	 public static void main(String args[])
	 {
		  System.out.println("Count value is :"+count);
	      Demo d1 = new Demo(); 
		  Demo d2 = new Demo(); 
		  Demo d3 = new Demo(); 
		  d1.execute(); 
		  d2.execute();
		  d3.execute(); 
		  
		  d1.displayCount();
		  d2.displayCount();
		  d3.displayCount();		  
	 }
}
