/*Task 1: Utility Method for Circle
Interface: CircleUtils
Task: Define a static method calculateArea(double radius) that returns the area of a circle.
Test: Call this method from the main() method.*/
interface CircleUtils
{
static void calculateArea(double radius)
{
System.out.println("Area of Circle is :" +Math.PI*radius*radius);
}
}
class CircleUtilsMain
{
public static void main(String args[])
{
CircleUtils.calculateArea(1.5);
}
}