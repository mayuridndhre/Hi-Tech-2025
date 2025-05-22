/* Static Method */ 
/*
Static Method can be called without creating object.
Static Methods cannot access non static members (instance vaiables/methods)
Static methods can access static variables and other static methods.
Static methods cannot use this or super keyword 
Static methods cannot access non static variables or methods directly.  
*/
class Operations 
{
	 static int x;
     static int square(int num)
	 {
	        return (num * num); 
	 }
	 static void show()
	 {
		 System.out.println("The value of x is :"+x);
	 }
	 public static void main(String args[])
	 {
		   Operations o = new Operations(); 
		   o.show(); 
		   System.out.println("Sqaure of 5 is : "+Operation.square(5));
	 }
}