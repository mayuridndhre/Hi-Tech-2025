//perimeter of circle

class PerimeterCircle4
{
double PI;
float radius;
double Perimeter;

void getdata(double p,int r)
{
PI=p;
radius=r;
}

double calc()
{
Perimeter=2*PI*radius*radius;
System.out.println("Perimeter of circle is "+Perimeter);
return Perimeter;
}
public static void main(String args[])
{
PerimeterCircle4 p=new PerimeterCircle4();
p.getdata(3.14,5);
p.calc();
}
}