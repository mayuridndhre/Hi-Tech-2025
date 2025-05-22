class SimpleInterest3
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
SimpleInterest3 s=new SimpleInterest3();
s.getdata();
s.calc();
s.display();
}
}