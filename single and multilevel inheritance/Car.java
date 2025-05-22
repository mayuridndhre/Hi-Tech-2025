/*Task 5: Vehicle and Car
Create a class Vehicle with attributes brand and speed, and a method showSpeed().
Create a class Car that inherits Vehicle and adds a method accelerate() that increases speed.
In the main method, create an object of Car, accelerate it, and display the updated speed.*/

class Vehicle
{
String brand;
int speed;

void showSpeed()
{
System.out.println(brand);
System.out.println(speed);
}
}
class Car extends Vehicle
{
void accelerate()
{
speed+=10;
}
public static void main(String args[])
{
Car c=new Car();
c.brand="BMW";
c.speed=150;
System.out.println("before increasing speed");
c.showSpeed();
System.out.println("After increasing speed");
c.accelerate();
c.showSpeed();
}
}