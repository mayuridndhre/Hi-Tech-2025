//write a java program to compute hexagon area.

import java.lang.Math;
class HexagonArea
{
int side;
double PI;
double AreaHexa;

void getdata()
{
side=6;
PI=3.14;
}
void calc()
{
AreaHexa=(6*side*side)/(4*Math.tan(PI/6));

}

void display()
{
System.out.println("The area of the hexagon is : "+AreaHexa);
}
public static void main(String args[])
{
HexagonArea h=new HexagonArea();
h.getdata();
h.calc();
h.display();
}
}