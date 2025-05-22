/*Task 1: Interface with Multiple Implementations
Objective: Understand how one interface can be implemented by multiple classes.
✅ Requirements:
Create an interface Shape with a method calculateArea().
Implement it in two classes: Circle and Rectangle.
Write a main method to create objects of both and print their areas.*/

interface Shape
{
int a=20;
int b=10;
void calculateArea();
}
class Circle implements Shape
{
public void calculateArea()
{
int c=a+b;
System.out.println(c);
}
}
class Rectangle implements Shape
{
public void calculateArea()
{
int c=a-b;
System.out.println(c);
}
}
class ShapeMain2
{
public static void main(String args[])
{
Shape s;
s=new Circle();
s.calculateArea();

s=new Rectangle();
s.calculateArea();
}
}