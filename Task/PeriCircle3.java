//perimeter of circle

class PerimeterCircle3
{
double PI;
int radius;
double Perimeter;

void getdata()
{
PI=3.14;
radius=5;
}

double calc()
{
Perimeter=2*PI*radius*radius;
return Perimeter;
}
public static void main(String args[])
{
PerimeterCircle3 p=new PerimeterCircle3();
p.getdata();
System.out.println("Perimeter of circle is "+p.calc());
}
}