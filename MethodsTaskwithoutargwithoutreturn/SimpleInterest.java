class SimpleInterest
{
int Principal;
int Rate;
int Time;
int SI;

void getdata()
{
Principal=20000;
Rate=10;
Time=2;
}
void calc()
{
SI=(Principal*Rate*Time)/100;
}

void show()
{
System.out.println("SimpleInterest is :"+SI);
}
public static void main(String args[])
{
SimpleInterest s=new SimpleInterest();
s.getdata();
s.calc();
s.show();
}
}