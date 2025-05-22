class Mul
{
int a,b,Multi;
void getdata()
{
a=5;
b=10;
}
int cal()
{
Multi=a*b;
return Multi;
//System.out.println("Multiplication of two nos is :"+Multi);
}

public static void main(String args[])
{
Mul m = new Mul();
m.getdata();
m.cal();
}
}