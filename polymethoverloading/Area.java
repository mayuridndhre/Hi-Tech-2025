/*ask 2: Area Calculator
Create a class Area with overloaded methods named calculateArea() to find:
Area of a circle
Area of a rectangle
Area of a triangle*/

class Area
{
double CalculateArea(int r)
{
return Math.PI*r*r;
}
int CalculateArea(int l,int b)
{
return l*b;
}
double CalculateArea(double b,double h)
{
return 0.5*b*h;
}
public static void main(String args[])
{
Area a=new Area();
System.out.println(a.CalculateArea(5));
System.out.println(a.CalculateArea(5,3));
System.out.println(a.CalculateArea(2.5,2.5));
}
}
