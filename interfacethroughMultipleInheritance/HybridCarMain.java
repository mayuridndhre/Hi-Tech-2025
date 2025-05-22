/*Task 2: Inheritance in Interface Hierarchy
Create interface Vehicle with a method start(). Create two more interfaces ElectricVehicle and PetrolVehicle extending Vehicle. Implement both interfaces in a class HybridCar.*/
interface Vehicle
{
void start();
}
interface ElectricVehicle extends Vehicle
{
void Charge();
}
interface PetrolVehicle extends Vehicle
{
void fuel();
}
class HybridCar implements ElectricVehicle,PetrolVehicle
{
public void start()
{
System.out.println("Vehicle Starting..");
}
public void Charge()
{
System.out.println("ElectricVehicle Charging.......");
}
public void fuel()
{
System.out.println("PetrolVehicle Fuel.......");
}
}
class HybridCarMain
{
public static void main(String args[])
{
HybridCar h=new HybridCar();
h.start();
h.Charge();
h.fuel();
}
}
