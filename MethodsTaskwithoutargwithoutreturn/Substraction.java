class Sub
{
int a,b,c,subst;

void getdata()
{
a=10;
b=20;
}
void sub()
{
subst=b-a;
}
void display()
{
System.out.println("Substraction of two nos is : "+subst);

}

public static void main(String args[])
{
Sub s= new Sub();
s.getdata();
s.sub();
s.display();
}

}
