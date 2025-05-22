class Swap3
{
int a,b,temp;
void getdata()
{
a=10;
b=20;
}
void show()
{
System.out.println("before Swapping of two nos a is :"+a+ "and b is : "+b);
}

int calc()
{
temp=a;
a=b;
b=temp;
return(a);
}
int calc1()
{
return(b);
}
public static void main(String args[])
{
Swap3 s=new Swap3();
s.getdata();
s.show();
System.out.println("after Swapping of two nos is a :"+s.calc());
System.out.println("after Swapping of two nos is b :"+s.calc1());


}
}