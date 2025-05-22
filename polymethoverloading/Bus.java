/*Task 4: Vehicle Speed
Create a base class Vehicle with method run(). Subclasses Bike, Car, and Bus should override the method to show their speeds.*/
class Vehicle
{
void run()
{
System.out.println("Parent class vehicle");
}
}
class Bike extends Vehicle
{
void run()
{
System.out.println("Bike class");
}
}
class Car extends Vehicle
{
void run()
{
System.out.println("Car class");
}
}
class Bus extends Vehicle
{
void run()
{
System.out.println("Bus class");
}
public static void main(String args[])
{
Vehicle v;

v=new Vehicle();
v.run();

v=new Bike();
v.run();

v=new Car();
v.run();

v=new Bus();
v.run();
}
}