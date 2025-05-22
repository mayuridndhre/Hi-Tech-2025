class Data{
double radius=7;
double length=5;
double breadth=3;
}
class Circle extends Data
{
double area;
void area_circle()
{
area=(22/7.0)*radius*radius;
}
void display()
{
System.out.println("Area of circle is :"+area);
}
public static void main(String args[])
{
Circle c=new Circle();
c.area_circle();
c.display();
}
}
class Rectangle extends Data
{
double area;
void area_rect()
{
area=length*breadth;
}
void display()
{
System.out.println("Area of rectangle is :"+area);
}
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.area_rect();
r.display();
}
}