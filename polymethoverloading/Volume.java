/*Task 4: Volume Overload
Create a class Volume with overloaded methods:
Volume of cube: volume(int side)
Volume of cuboid: volume(int l, int b, int h)
Volume of cylinder: volume(double radius, double height)*/

class Volume
{
int Volume(int side)
{
return side*side*side;
}

int Volume(int l,int w,int h)
{
return l*w*h;
}

double Volume(int r,int h)
{
return Math.PI*r*r*h;
}
public static void main(String args[])
{
Volume v=new Volume();
System.out.println(v.Volume(5));
System.out.println(v.Volume(5,2,5));
System.out.println(v.Volume(5,2));
}
}