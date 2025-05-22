/*ask 4: Chaining Multiple Constructors
Write a class Laptop with:

A default constructor that calls another constructor with this().
A constructor with one parameter (calls another constructor).
A constructor with two parameters (final constructor).
Constructor calls flow:
Laptop() → Laptop(String brand) → Laptop(String brand, int ram)*/

class Laptop
{
String brand;
int ram;

Laptop()
{
this("hp");
System.out.println("default constructor called");
}

Laptop(String brand)
{
this("Dell",16);
this.brand=brand;
System.out.println("one parameterized constructor called");
}

Laptop(String brand,int ram)
{
this.brand=brand;
this.ram=ram;
System.out.println("two parameterized constructor called");
}

public static void main(String args[])
{
Laptop l=new Laptop();
}
}