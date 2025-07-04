/*Create classes Car and Bike that extend Vehicle and override showDetails().
Create a VehicleUtil class in the utils package that:
Is final
Has a static final constant
Has a static method to print welcome message
Create the Main class in the main package that:
Creates instances of Car and Bike
Demonstrates polymorphism, overloading, and use of static methods*/

package vehiclemanagement.models;

public class Car extends Vehicle
{
int CarSpeed;

public Car(String brand,String model,int year,int CarSpeed)
{
super(brand,model,year);
this.CarSpeed=CarSpeed;
}

@Override
public void showDetails()
{
System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", CarSpeed: " + CarSpeed);

}
}