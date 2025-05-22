interface Vehicle 
{
     int speed = 120; // interface variable
     void start(); // Abstarct Method 
	 default void fuelType()
	 {
	     System.out.println("Default Fuel Type is Petrol");
	 }
}
class Car implements Vehicle
{
     public void start()  // Implement abstract method
	 {  
	       System.out.println("Car is Starting.....");
	 }
	public void fuelType()
	 {
	      //Vehicle.super.fuelType();  //extra line if we want to call interface fueltype method then //use interface name.super.method name
	      System.out.println("This Car is runs on Disel.....");
	 }
	 public void showSpeed()
	 {
		    System.out.println("Max allowed speed is "+speed+" km/hr");
	 }
}
class Main
{
    public static void main(String agrs[])
	{
	      Car c = new Car(); 
		  c.start(); 
		  c.fuelType();
		  c.showSpeed(); 
	}
}