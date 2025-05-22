/*ask 3: Shape Drawing
Create a superclass Shape with a method draw(). Subclasses Circle, Rectangle, and Triangle override the draw() method with specific behavior.*/

class Shape
{
void draw()
{
System.out.println("Parent class Shape method");
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("Circle method");
}
}
class Rectangle extends Shape
{
void draw()
{
System.out.println("Rectangle method");
}
}
class Triangle extends Shape
{
void draw()
{
System.out.println("Triangle method");
}
public static void main(String args[])
{
Shape t;

t=new Shape();
t.draw();

t=new Circle();
t.draw();

t=new Rectangle();
t.draw();

t=new Triangle();
t.draw();
}
}