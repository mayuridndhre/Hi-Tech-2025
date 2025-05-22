/*Task 1: Area Calculation using Method Overloading
Objective:
Create a class AreaCalculator that has overloaded methods:

calculateArea(int side) → calculates the area of a square.
calculateArea(int length, int breadth) → calculates the area of a rectangle.
calculateArea(double radius) → calculates the area of a circle.*/

class AreaCalculator
{
int side;
int length;
int breadth;
double radius;
int calareaofsq;
int calarearect;
double calareacircle;

void calculateArea(int side)
{
this.side=side;
calareaofsq=side*side;
System.out.println("area of square is :"+calareaofsq);
}

void calculateArea(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
calarearect=length*breadth;
System.out.println("area of rectangle is :"+calarearect);
}

void calculateArea(double radius)
{
this.radius=radius;
calareacircle=3.14*radius*radius;
System.out.println("area of circle is :"+calareacircle);
}

public static void main(String args[])
{
AreaCalculator a=new AreaCalculator();
a.calculateArea(2);
a.calculateArea(5,4);
a.calculateArea(10);

}

}