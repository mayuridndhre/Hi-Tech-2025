/*ask 5: Real-world Simulation
Create interfaces Sensor and Communicator. In a class SmartDevice, implement both interfaces to simulate sensing and communication behavior.*/
interface Sensor
{
void sense();
}
interface Communicator
{
void communicate();
}
class SmartDevice implements Sensor,Communicator
{
public void sense()
{
System.out.println("Sensor..");
}
public void communicate()
{
System.out.println("Communicator..");
}
}
class SmartDeviceMain
{
public static void main(String args[])
{
SmartDevice s=new SmartDevice();
s.sense();
s.communicate();
}
}