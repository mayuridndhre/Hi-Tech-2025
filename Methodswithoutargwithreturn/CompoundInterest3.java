class CompoundInterest3
{
int Principal,Rate,Time;
double Amount,CI;

void getdata()
{
Principal=20000;
Rate=10;
Time=2;
}
double calc()
{
Amount=Principal*Math.pow(1+Rate/100,Time);
CI=Amount-Principal;
return CI;
}

void display()
{
System.out.println("Compound Interest is : "+CI);
}
public static void main(String args[])
{
CompoundInterest3 c=new CompoundInterest3();
c.getdata();
c.calc();
c.display();
}
}