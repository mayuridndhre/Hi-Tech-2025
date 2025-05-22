/*Task 2: this to Assign Values in a Setter Method
Create a class Car with instance variables brand and year.

Define a default constructor that sets empty values.
Write a setValues(String brand, int year) method to assign values.
Use this to refer to instance variables inside the method.
Implement display() to print car details.*/

class Car1
{

String brand;
int year;

Car1()
{
brand="null";
year=0;
}

void setValues(String brand,int year)
{
this.brand=brand;
this.year=year;
}

void display()
{
System.out.println(brand);
System.out.println(year);
}
public static void main(String args[])
{
Car1 c=new Car1();
c.setValues("Tata Motors",2024);
c.display();
}
}
