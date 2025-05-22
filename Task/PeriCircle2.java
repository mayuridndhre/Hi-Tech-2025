//perimeter of circle

class PerimeterCircle2
{
double PI;
int radius;
double Perimeter;

void getdata(double p,int r)
{
PI=p;
radius=r;
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
PerimeterCircle2 p=new PerimeterCircle2();
p.getdata(3.14,5);
p.calc();
p.display();
}
}