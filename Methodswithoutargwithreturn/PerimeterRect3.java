class PerimeterRect3
{
int length,width,PeriRect;
void getdata()
{
length=10;
width=50;
}

int calc()
{
PeriRect=2*(length+width);
return PeriRect;
}

void display()
{
System.out.println("Perimeter of Rectangle is : "+PeriRect);
}
public static void main(String args[])
{
PerimeterRect3 p = new PerimeterRect3();
p.getdata();
p.calc();
p.display();
}
}