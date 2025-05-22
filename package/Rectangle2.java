/*Practice Task 3: Package - geometry
Objective: Access classes from another package.
Create a package geometry.
Add a class Rectangle with fields length, width and method getArea().
Create a main class AreaApp in a different package calculation to use the Rectangle class and calculate area.*/

package geometry;
public class Rectangle2
{
int length=5;
int width=10;

public void getArea()
{
int a=length*width;
System.out.println("Area of Rectangle is :"+a);
}
}
