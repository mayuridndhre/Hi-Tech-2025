/*Task 3: Vehicle Engine System
Objective: Model various vehicles using abstraction.
Define an abstract class Vehicle with abstract methods like startEngine() and stopEngine().
Create child classes Car, Bike, and Truck that implement these methods.
Test the abstraction by calling the implemented methods using a Vehicle reference.*/
abstract class Vehicle 
{
abstract void startEngine();
abstract void stopEngine();
}
class Car extends Vehicle
{
void startEngine()
{
System.out.println("Car Start");
}
void stopEngine()
{
System.out.println("Car Stop");
}
}
class Bike extends Vehicle
{
void startEngine()
{
System.out.println("Bike Start");
}
void stopEngine()
{
System.out.println("Bike Stop");
}
}

class Truck extends Vehicle
{
void startEngine()
{
System.out.println("Truck Start");
}
void stopEngine()
{
System.out.println("Truck Stop");
}
}
class VehicleMain
{
public static void main(String args[])
{
Vehicle v;
v=new Car();
v.startEngine();
v.stopEngine();

v=new Bike();
v.startEngine();
v.stopEngine();

v=new Truck();
v.startEngine();
v.stopEngine();

}
}

