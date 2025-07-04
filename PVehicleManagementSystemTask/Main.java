//vehiclemanagement.main – For the Main class.
/*Create the Main class in the main package that:
Creates instances of Car and Bike
Demonstrates polymorphism, overloading, and use of static methods*/

package vehiclemanagement.main;

import vehiclemanagement.models.Car;
import vehiclemanagement.models.Bike;
import vehiclemanagement.utils.VehicleUtil;


public class Main
{
public static void main(String args[])
{

VehicleUtil.displayMessage();

Car c=new Car("Toyota","Camry",2022,40);
c.showDetails("Mayuri");
c.showDetails();
System.out.println("---------------------------------");


Bike b=new Bike("Honda","CBR",2021,60);
b.showDetails("Mahii");
b.showDetails();


}
}