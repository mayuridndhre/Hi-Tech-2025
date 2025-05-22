class Mul3
{
int a,b,Mul;
void getdata()
{
a=5;
b=6;
}
int calc()
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
Mul3 m=new Mul3();
m.getdata();
m.calc();
m.show();
}
}