class PerimeterRect4
{
int length,width,PeriRect;

void getdata(int l,int w)
{
length=l;
width=w;
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
PerimeterRect4 p = new PerimeterRect4();
p.getdata(5,2);
p.calc();
p.display();
}
}