class Sub4
{
int a,b,subst;

void getdata(int x,int y)
{
a=x;
b=y;
}
int calc()
{
subst=b-a;
return(subst);
}
void show()
{
System.out.println("Substraction of two nos is : "+subst);
}
public static void main(String args[])
{
Sub4 s=new Sub4();
s.getdata(10,40);
s.calc();
s.show();
}
}