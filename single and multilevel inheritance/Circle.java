/*Task 4: Shape and Circle
Create a class Shape with a method area() that prints "Calculating area...".
Create a class Circle that inherits Shape, has an additional attribute radius, and overrides the area() method to calculate the area of a circle.
In the main method, create a Circle object, set its radius, and calculate/display the area.*/

class Shape
{
void area()
{
System.out.println("Calculating area..");
}
}
class Circle extends Shape
{
int radius;

void calc()
{
  double circleArea = Math.PI * radius * radius;
  System.out.println("Area of Circle: " + circleArea);
}
public static void main(String args[])
{
Circle c=new Circle();
c.radius=5;
c.area();
c.calc();

}
}