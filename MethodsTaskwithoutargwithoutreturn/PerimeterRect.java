class PerimeterRect
{
int length,width,PeriRect;

void getdata()
{
length=10;
width=20;
}

void calc()
{
PeriRect=2*(length+width);
}

void display()
{
System.out.println("Perimeter of Rectangle is : "+PeriRect);
}

public static void main(String args[])
{
PerimeterRect p=new PerimeterRect();
p.getdata();
p.calc();
p.display();
}

}