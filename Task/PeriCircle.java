//perimeter of circle

class PerimeterCircle
{
double PI;
int radius;
double Perimeter;

void getdata()
{
PI=3.14;
radius=5;
}

void calc()
{
Perimeter=2*PI*radius*radius;
}
void display()
{
System.out.println("Perimeter of circle is "+Perimeter);
}
public static void main(String args[])
{
PerimeterCircle p=new PerimeterCircle();
p.getdata();
p.calc();
p.display();
}
}