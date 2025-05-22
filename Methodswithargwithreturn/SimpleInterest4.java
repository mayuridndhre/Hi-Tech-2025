class SimpleInterest4
{
int Principal;
int Rate;
int Time;
int SI;

void getdata(int p,int r,int t)
{
Principal=p;
Rate=r;
Time=t;
}
int calc()
{
SI=(Principal*Rate*Time)/100;
return SI;
}
void display()
{
System.out.println("Simple Interest is : "+SI);
}
public static void main(String args[])
{
SimpleInterest4 s=new SimpleInterest4();
s.getdata(20000,10,2);
s.calc();
s.display();
}
}