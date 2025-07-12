/*Practice Task 4: Temperature Monitor
Objective: Throw exception if temperature is beyond safe range.
Instructions:
Accept temperature from user.
If temperature < 0 or > 100, throw TemperatureOutOfRangeException*/
import java.util.Scanner;
import java.util.InputMismatchException;


class TemperatureOutOfRangeException extends Exception
{
public TemperatureOutOfRangeException(String message)
{
super(message);
}
}
class TempMonitor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

try
{
System.out.println("Enter temperature");
int temperature=sc.nextInt();

if(temperature<0 || temperature>100)
{
throw new TemperatureOutOfRangeException("Temperature must be in between o to 100 ");
}
else
System.out.println("Temperature is :"+temperature);
}
catch(InputMismatchException e)
{
System.out.println("Invalid input : Please enter a valid input");
}
catch(TemperatureOutOfRangeException e)
{
System.out.println(e.getMessage());
}

}
}