class Div3
{
int a,b;
float Div;
void getdata()
{
a=20;
b=5;
}
float calc()
{
Div=a/b;
System.out.println("Division of two nos is : "+Div);
return a/b;
}
public static void main(String args[])
{
Div3 d=new Div3();
d.getdata();
d.calc();

}
}