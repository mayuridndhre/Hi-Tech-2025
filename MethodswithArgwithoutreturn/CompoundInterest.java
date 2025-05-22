class CompoundInterest
{
int principal;
int Rate;
int Time;
double Amount;
double CI;

void getdata(int x,int y,int z)
{
principal=x;
Rate=y;
Time=z;
calc();
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
c.getdata(20000,20,2);
c.display();
}
}