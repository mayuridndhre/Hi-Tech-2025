/*Category 3: this to Call a Parameterized Constructor
Task 6: Chaining Multiple Constructors
Create a class Laptop with:

A default constructor that calls another constructor with this().
A constructor with one parameter (calls another constructor).
A constructor with two parameters (final constructor).
Constructor calls flow:
Laptop() → Laptop(String brand) → Laptop(String brand, int ram)8?*/

class Laptop1
{
String brand;
int ram; 

Laptop1()
{
this("Dell");
}

Laptop1(String brand)
{
this("HP",32);
this.brand=brand;
System.out.println("brand is :"+brand);
}

Laptop1(String brand,int ram)
{
this.brand=brand;
this.ram=ram;
System.out.println("brand is :" +brand+ "and ram is :"+ram);
}

public static void main(String args[])
{
Laptop1 l=new Laptop1();
}
}