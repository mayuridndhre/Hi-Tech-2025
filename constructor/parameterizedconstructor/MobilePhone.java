/*Write a MobilePhone class that accepts brand, model, and price as parameters in the constructor. Display the phone details using a method.*/

class MobilePhone
{
String brand;
String model;
int price;

MobilePhone(String b,String m,int p)
{
brand=b;
model=m;
price=p;
}

void display()
{
System.out.println("Mobile brand is :"+brand);
System.out.println("Mobile model is :"+model);
System.out.println("Mobile price is :"+price);
}

public static void main(String args[])
{
MobilePhone m=new MobilePhone("Samsung","xyz",30000);
m.display();
}
}

