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

public interface VehicleInfo
{
void showDetails();
}
