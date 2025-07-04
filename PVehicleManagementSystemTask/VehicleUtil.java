/*Create a VehicleUtil class in the utils package that:
Is final
Has a static final constant
Has a static method to print welcome message*/
 
 package vehiclemanagement.utils;
 
 
 public final class VehicleUtil
 {

 public static final String Welcome="Welcome to our ShowRoom";
 
 public static void displayMessage()
 {
 System.out.println(Welcome);
 }
 }