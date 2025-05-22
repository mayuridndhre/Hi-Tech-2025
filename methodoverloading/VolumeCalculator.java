/*ask 5: Volume Calculation Using Overloading
Objective:
Create a class VolumeCalculator that has overloaded methods:

calculateVolume(int side) → calculates volume of a cube.
calculateVolume(int radius, int height) → calculates volume of a cylinder.
calculateVolume(double length, double width, double height) → calculates volume of a cuboid.*/

class VolumeCalculator
{

int calculateVolume(int side)
{
return side*side*side;
}

double calculateVolume(int radius,int height)
{
return 3.14*radius*radius*height;
}

double calculateVolume(double length,double width,double height)
{
return length*width*height;
}
public static void main(String args[])
{
VolumeCalculator v=new VolumeCalculator();
System.out.println("volume of cube is :" +v.calculateVolume(5));
System.out.println("volume of cylinder is :" +v.calculateVolume(5,10));
System.out.println("volume of cuboid is :" +v.calculateVolume(5,15,10));
}
}