/*Create a Vehicle class with three constructors:
Default constructor with "Unknown" as brand.
Constructor with brand and model.
Constructor with brand, model, and year.*/

class Vehicle
{
String brand;
String model;
int year;

Vehicle()
{
brand="Unknown";
}

Vehicle(String b,String m)
{
brand=b;
model=m;
}

Vehicle(String b,String m,int y)
{
brand=b;
model=m;
year=y;
}

void show()
{
System.out.println(brand);
System.out.println(model);
System.out.println(year);
}

public static void main(String args[])
{
Vehicle v=new Vehicle();
v.show();
Vehicle v1=new Vehicle("Maruti Suzuki","Swift");
v1.show();
Vehicle v2=new Vehicle("Tesla","Model 3",2025);
v2.show();
}
}