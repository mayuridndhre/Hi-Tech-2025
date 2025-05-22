/*Implement a Computer class with overloaded constructors:
Default constructor with "Unknown Brand".
Constructor with brand and price.
Constructor with all attributes (brand, price, RAM size).*/

class Computer
{
String brand;
int price;
int RamSize;

//default constructor
Computer()
{
brand="Unknown Brand";
}

Computer(String b,int p)
{
brand=b;
price=p;
}

Computer(String b,int p,int r)
{
brand=b;
price=p;
RamSize=r;
}

void show()
{
System.out.println(brand);
System.out.println(price);
System.out.println(RamSize);
}

public static void main(String args[])
{
Computer c=new Computer();
c.show();
Computer c1=new Computer("HP",75000);
c1.show();
Computer c2=new Computer("Dell",60000,32);
c2.show();
}

}

