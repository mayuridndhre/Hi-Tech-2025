class CompoundInterest4
{
int Principal,Rate,Time;
double Amount,CI;

void getdata(int x,int y,int z)
{
Principal=x;
Rate=y;
Time=z;
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
CompoundInterest4 c=new CompoundInterest4();
c.getdata(20000,10,2);
c.calc();
c.display();
}
}