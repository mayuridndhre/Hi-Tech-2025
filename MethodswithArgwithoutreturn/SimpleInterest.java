class SimpleInterest
{
int Principal;
int Rate;
int Time;
int SI;

void getdata(int x,int y,int z)
{
Principal=x;
Rate=y;
Time=z;
calc();
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
s.getdata(20000,20,2);
s.show();
}
}