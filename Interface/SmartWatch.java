/*एक interface WiFiEnabled तयार कर, ज्यात connectToWiFi() method असो.
दुसरं interface BluetoothEnabled तयार कर, ज्यात pairDevice() method असो.
एक SmartWatch नावाचा class तयार कर जो दोन्ही interfaces implement करेल.
SmartWatch मध्ये दोन्ही methods implement कर.
main method मध्ये, SmartWatch चा object तयार करून दोन्ही methods call कर.
*/
interface WiFiEnabled
{
void connectToWiFi();
}
interface BlueToothEnabled
{
void pairDevice();
}
class SmartWatch implements WiFiEnabled,BlueToothEnabled
{
public void connectToWiFi()
{
System.out.println("Connecting to WiFi....!");
}
public void pairDevice()
{
System.out.println("pairing with Bluetooth Device....!");
}
public static void main(String args[])
{
SmartWatch s=new SmartWatch();
s.connectToWiFi();
s.pairDevice();
}
}