class Demo1
{
int a=5;

final void show()
{
System.out.println(a);
}

}
class Demo2 extends Demo1
{
void show() // show() in Demo2 cannot override show() in Demo1
{
System.out.println(a);
}
}

class Main
{
public static void main(String args[])
{
Demo2 m=new Demo2();
m.show();
}
}