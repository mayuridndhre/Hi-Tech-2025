class CompoundInterest
{
int principal;
int Rate;
int Time;
double Amount;
double CI;

void getdata()
{
principal=40000;
Rate=10;
Time=2;
}

void calc()
{
Amount=principal*Math.pow(1+Rate/100,Time);
CI=Amount-principal;
}

void display()
{
System.out.println("Compound Interest is : "+CI);
}

public static void main(String args[])
{
CompoundInterest c=new CompoundInterest();
c.getdata();
c.calc();
c.display();
}
}