/*
Create packages:
vehiclemanagement.models – For Vehicle, Car, Bike, and Interface.
vehiclemanagement.utils – For utility class and constants.
vehiclemanagement.main – For the Main class.
---------------------------------------------------------------------------
Create an interface VehicleInfo with a method showDetails().
Create a base class Vehicle with attributes: brand, model, year, and:
Constructor
Method showDetails()
Overloaded method showDetails(String ownerName)
-------------------------------------------------------------------------------
Create classes Car and Bike that extend Vehicle and override showDetails().
Create a VehicleUtil class in the utils package that:
Is final
Has a static final constant
Has a static method to print welcome message
Create the Main class in the main package that:
Creates instances of Car and Bike
Demonstrates polymorphism, overloading, and use of static methods*/

package vehiclemanagement.models;


public class Vehicle implements VehicleInfo
{
String brand;
String model;
int year;

public Vehicle(String brand,String model,int year)
{
this.brand=brand;
this.model=model;
this.year=year;
}

@Override
public void showDetails()
{
System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year );

}

public void showDetails(String ownerName)
{
System.out.println("OwnerName of Vehicle is  : " +ownerName);
}

}




 