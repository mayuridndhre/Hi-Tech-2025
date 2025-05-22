//Try accessing it from another package (should fail).

package pack1;
 
class Per
{
String name="Raksha";
int age=24;

void displayDetails()
{
System.out.println("Person name is : "+name+ " and age is :"+age);
}
}