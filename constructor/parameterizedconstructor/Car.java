 /*Create a Car class with a parameterized constructor that accepts brand and price and initializes them. Write a method to display car details.*/

class Car
{
String brand;
int price;

Car(String b,int p)
{
brand=b;
price=p;
}
void display()
{
System.out.println("Brand of car is :"+brand);
System.out.println("Price of car is :"+price);
}
public static void main(String args[])
{
Car c=new Car("BMW",2000000);
c.display();
}
}