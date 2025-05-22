class Sub
{
int a,b,c,subst;

void sub(int a,int b)
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
s.sub(20,70);
s.display();
}

}
