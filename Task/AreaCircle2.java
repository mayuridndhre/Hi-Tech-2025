//Wap to calculate area of circle.

class AreaCircle2
{

 int radius;
 double PI;
 double Area;

void getdata(int r,double a)
{
radius=r;
PI=a;
}
void calc()
{
Area=PI*radius*radius;
}
void display()
{
System.out.println("Area of circle is : "+Area);
}
public static void main(String args[])
{
AreaCircle2 a=new AreaCircle2();
a.getdata(5,3.14);
a.calc();
a.display();
}

}