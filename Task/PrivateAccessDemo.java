class PrivateAccessDemo
{
 private int number=700;

 private void showMessage()
{
System.out.println("value of no is : "+number);
}
void display()
{
showMessage();
}
}

class TestPrivateAccess
{
public static void main(String args[])
{
PrivateAccessDemo p=new PrivateAccessDemo();
p.display();
}
}