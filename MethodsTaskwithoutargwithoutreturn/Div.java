class Div
{
int a,b,Div;
void getdata()
{
a=5;
b=10;
}
int cal()
{
Div=a/b;
System.out.println("Div of two nos is :"+Div);
}

public static void main(String args[])
{
Mul m = new Mul();
m.getdata();
m.cal();
}
}