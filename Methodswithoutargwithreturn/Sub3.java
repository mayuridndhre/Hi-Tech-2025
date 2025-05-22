class Sub3
{
int a,b,subst;

void getdata()
{
a=10;
b=40;
}
int calc()
{
subst=b-a;
show();
return(subst);
}
void show()
{
System.out.println("Substraction of two nos is : "+subst);
}
public static void main(String args[])
{
Sub3 s=new Sub3();
s.getdata();
s.calc();
}
}