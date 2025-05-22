//Wap to calculate area of circle.

class AreaCircle4
{
 int radius;
 double PI;
 double Area;

void getdata(int r,double a)
{
radius=r;
PI=a;
}
double calc()
{
Area=PI*radius*radius;
System.out.println("Area of circle is "+Area);
return Area;
}
public static void main(String args[])
{
AreaCircle4 a=new AreaCircle4();
a.getdata(5,3.14);
a.calc();
}
}