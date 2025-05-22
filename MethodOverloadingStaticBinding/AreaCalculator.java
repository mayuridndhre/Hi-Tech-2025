/*Task 1: Area Calculator
Create a class AreaCalculator with overloaded methods:
area(int side) – for square
area(int length, int breadth) – for rectangle
area(double radius) – for circle
Call each method from main() and print the results.*/
class AreaCalculator
{
double cal;


void area(int side)
{
cal=side*side;
System.out.println("Area of Square is :"+cal);
}
void area(int length,int breadth)
{
cal=length*breadth;
System.out.println("Area of Rectangle is :"+cal);
}
void area(double radius)
{
cal=Math.PI*radius*radius;
System.out.println("Area of Circle is :"+cal);
}
public static void main(String args[])
{
AreaCalculator a=new AreaCalculator();
a.area(5);
a.area(5,2);
a.area(1.5);
}
}