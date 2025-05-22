/*Task 3: Vehicle → Car → ElectricCar
Create a class Vehicle with attributes brand and speed, and a method showSpeed().
Create a class Car that inherits Vehicle and has a method accelerate().
Create a further class ElectricCar that inherits Car and has a method chargeBattery().
In main(), create an ElectricCar object and test all methods.*/

class Vehicle
{
String brand;
int speed;
void showSpeed()
{
System.out.println("brand is : " +brand);
System.out.println("speed is :" +speed);
}
}
class Car extends Vehicle
{
void accelerate()
{
speed+=20;
}
}
class ElectricCar extends Car
{
void chargeBattery()
{
System.out.println("Battery charged....!");
}
public static void main(String args[])
{
ElectricCar e=new ElectricCar();
e.brand="Audi";
e.speed=200;
System.out.println("Before speed");
e.showSpeed();
System.out.println("After speed ");
e.accelerate();
e.showSpeed();
e.chargeBattery();
}
}