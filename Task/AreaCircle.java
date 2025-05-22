//Wap to calculate area of circle

class AreaCircle
{
 int radius;
 double PI;
 double Area;

void getdata()
{
radius=5;
PI=3.14;
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
AreaCircle a=new AreaCircle();
a.getdata();
a.calc();
a.display();
}

}