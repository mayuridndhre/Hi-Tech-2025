/* // 2. Multilevel Inheritance
Only one Super class Only Sub Class Only intermidiate class is called as Multilevel Inheritance. 

The mechniasm of creating subclass from the intermidiate class is called as Multilevel Inheritance. 

The mechniasm of creating child class from the intermidiate class is called as Multilevel Inheritance. 

The mechniasm of creating derived class from the intermidiate class is called as Multilevel Inheritance. 
*/ 
class Length 
{
       double length;
	   void get_length()     // Method definition
	   {
	          length = 3.2; 
	   }
}
class Breadth extends Length
{
       double breadth;
	   void get_breadth()     // Method definition
	   {
	          breadth = 6.3; 
	   }
}
class Rectangle extends Breadth 
{
      double area_rect;    // Data Member 
	  void calculate()   // // Method definition
	  {
	       area_rect = length * breadth; 
	  }
	  void display()     // Method definition 
	  {
	       System.out.println("Area of rectangle is "+area_rect);
	  }
	  public static void main(String args[])
	  {
	       Rectangle r = new Rectangle();    // Object Creation 
		   r.get_length();    // Method Call 
		   r.get_breadth();    // Method Call 
		   r.calculate();        // Method Call 
		   r.display();         // Method Call 
	  }
}