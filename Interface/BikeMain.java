/*Task 4: Interface with Constant
Objective: Interface with a constant and method.
Create an interface Vehicle with:
A constant MAX_SPEED = 120
A method run()
Create a class Bike that implements it and displays the max speed in its method.*/
interface Vehicle
{
int MAX_SPEED=120;  //bedefault public,static,final consider
void run();
}
class Bike implements Vehicle
{
public void run()
{
System.out.println(MAX_SPEED);
}
}
class BikeMain
{
public static void main(String args[])
{
Bike b=new Bike();
b.run();
}
}