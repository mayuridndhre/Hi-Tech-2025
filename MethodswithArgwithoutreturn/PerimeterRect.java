class PerimeterRect
{
int length,width,PeriRect;

void getdata(int x,int y)
{
length=x;
width=y;
calc();
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
p.getdata(10,20);
p.display();
}

}