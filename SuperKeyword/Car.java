/*Practice Task 1: Accessing Parent Class Variable
Task:
Create a class Vehicle with a variable type = "Generic Vehicle".
Create a subclass Car with a variable type = "Car".
Use super.type in the subclass to print the parent class value.*/

class Vehicle
{
String type="Generic Vehicle";
}
class Car extends Vehicle
{
String type="Car";
void show()
{
System.out.println("Type of car is :"+type);
System.out.println("Type of Vehicle is :"+super.type);
}
public static void main(String args[])
{
Car c=new Car();
c.show();
}
}