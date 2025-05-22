/*Design a laptop class with brand and price instance variables. The default constructor should assign "unknown" to brand and 0 to price, then print the details.*/

class Laptop
{
String brand;
int price;

Laptop()
{
brand="Unknown";
price=0;
}

void display()
{
System.out.println("laptop brand is "+brand);
System.out.println("Laptop price is "+price);
}

public static void main(String args[])
{
Laptop l=new Laptop();
l.display();
}
}