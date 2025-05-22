/*Category 2: this to Pass an Argument in a Method Call
Task 4: Pass this to a Method in the Same Class
Write a class Car with:

An instance variable brand.
A method showDetails(Car obj) that accepts an object of Car.
A method display() that calls showDetails(this).*/

class Car2
{
String brand;

void showDetails(Car2 obj)  //method that accepts Car2 object
{
System.out.println("Show details method call");
}

void display()
{
showDetails(this);  //passing current instance to method
}
public static void main(String args[])
{
Car2 c=new Car2();
c.display();
}
}