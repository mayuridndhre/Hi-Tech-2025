class Mul
{
int a,b,Multi;
void getdata(int x,int y)
{
a=x;
b=y;
}
void cal()
{
Multi=a*b;
}
void show()
{
System.out.println("Multiplication of two nos is :"+Multi);
}

public static void main(String args[])
{
Mul m = new Mul();
m.getdata(10,20);
m.cal();
m.show();
}
}