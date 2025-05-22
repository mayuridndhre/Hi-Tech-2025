class Mul4
{
int a,b,Mul;

void getdata(int x,int y)
{
a=x;
b=y;
calc(a,b);
}

int calc(int a,int b)
{
Mul=a*b;
return Mul;
}
void show()
{
System.out.println("Multiplication of two nos is : "+Mul);
}
public static void main(String args[])
{
Mul4 m=new Mul4();
m.getdata(5,6);
m.show();
}
}