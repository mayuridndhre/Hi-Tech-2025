/*Hierarchical Inheritance 

Task 1: Vehicle Inheritance
Create a Vehicle class with properties like brand and speed. Then, create two subclasses:

Car (with an additional property fuelType)

Bike (with an additional property helmetRequired)
Implement methods to display their details.*/

class Vehicle
{
String brand;
int speed;
}
class Car extends Vehicle
{
String fuelType;
void car_Details()
{
System.out.println("Brand name of car is :"+brand);
System.out.println("Speed of car is :"+speed);
System.out.println("FuelType of car is :"+fuelType);
System.out.println("--------------------------");
}
}
class Bike extends Vehicle
{
String helmetRequired;
void Bike_Details()
{
System.out.println("Brand name of Bike is :"+brand);
System.out.println("Speed of Bike is :"+speed);
System.out.println("Bike helmet is :"+helmetRequired);
System.out.println("--------------------------");
}

}
class Vehi
{
public static void main(String args[])
{
Car c=new Car();
c.brand="Maruti Suzuki";
c.speed=180;
c.fuelType="Petrol";
c.car_Details();

Bike b=new Bike();
b.brand="Raider";
b.speed=120;
b.helmetRequired="Yes";
b.Bike_Details();
}
}