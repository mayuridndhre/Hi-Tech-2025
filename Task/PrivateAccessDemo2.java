class PrivateAccessDemo2
{
private int number=700;

void showMessage()
{
System.out.println("value of no is : "+number);
}
}

class TestPrivateAccess2
{
public static void main(String args[])
{
PrivateAccessDemo2 p=new PrivateAccessDemo2();
p.showMessage();
}
}