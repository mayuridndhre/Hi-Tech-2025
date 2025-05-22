//Wap to calculate area of circle

class AreaCircle3
{
 int radius;
 double PI;
 double Area;

void getdata()
{
radius=5;
PI=3.14;
}
double calc()
{
Area=PI*radius*radius;
return Area;
}

public static void main(String args[])
{
AreaCircle3 a=new AreaCircle3();
a.getdata();
System.out.println("Area of circle is "+a.calc());
}

}