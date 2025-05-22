/*Task 1: Shape Area Calculator
Objective: Use abstraction to define a general Shape class with an abstract method calculateArea().
Create an abstract class Shape with calculateArea() as an abstract method.
Create subclasses like Circle, Rectangle, and Triangle that implement the calculateArea() method.
In the main method, create objects and call their respective area calculation methods.*/
abstract class Shape
{
abstract void calculateArea();
}
class Circle extends Shape
{
void calculateArea()
{
System.out.println("Circle class method");
}
}
class Rectangle extends Shape
{
void calculateArea()
{
System.out.println("Rectangle class method");
}
}
class Triangle extends Shape
{
void calculateArea()
{
System.out.println("Triangle class method");
}
}
class ShapeMain
{
public static void main(String args[])
{
Shape s=new Circle();
s.calculateArea();

s=new Rectangle();
s.calculateArea();

s=new Triangle();
s.calculateArea();
}
}