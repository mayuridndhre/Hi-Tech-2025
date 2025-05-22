/*Task 4: Shapes Area Calculation
Create a Shape class with a method calculateArea().
Then, create subclasses:

Circle (calculate area using π * r * r)

Rectangle (calculate area using length * width)

Triangle (calculate area using 0.5 * base * height)

Take user input for dimensions and display the area.*/

class Shape
{
double r=5;
int length=4;
int width=10;
double height=6;
double base=2;
double area;

void calculateArea()
{
System.out.println("Parent class method");
}
}
class Circle extends Shape
{

void area_circle()
{
area=22/7.0*r*r;
System.out.println("Area of circle is :"+area);
System.out.println("-----------------------------");
}
}
class Rectangle extends Shape
{

void area_rect()
{
area=length*width;
System.out.println("Area of Rectangle is :"+area);
System.out.println("-----------------------------");
}
}
class Triangle extends Shape
{

void area_Triangle()
{
area=0.5*base*height;
System.out.println("Area of Triangle is :"+area);
System.out.println("-----------------------------");
}
}
class shapeMain
{
public static void main(String args[])
{
Circle c=new Circle();
c.calculateArea();
c.area_circle();

Rectangle r=new Rectangle();
r.calculateArea();
r.area_rect();

Triangle t=new Triangle();
t.calculateArea();
t.area_Triangle();
}
}