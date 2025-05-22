//Concept of Inheritance 
class A
{
       int a = 10;   // Data Member Initialization 
}
class B extends A
{
     int b = 20;   // Data Member initalization 
	 void sum()  // Method Definition 
	 {
	     System.out.println("Additon of 2 number is "+(a+b));
	 }
	 public static void main(String args[])
	 {
	        B obj = new B();  // Object Creation 
			obj.sum();   // Method Call 
	 }
}