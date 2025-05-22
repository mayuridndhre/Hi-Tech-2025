/*Develop a Rectangle class that takes length and width as parameters. Write a method to calculate and return the area.*/

class Rectangle
{
int length;
int width;
int cal;

Rectangle(int l,int w)
{
length=l;
width=w;
}

int calculate()
{
cal=length*width;
return cal;
}
public static void main(String args[])
{
Rectangle r=new Rectangle(5,10);
System.out.println("Area of Rectangle is :"+r.calculate());
}
}
