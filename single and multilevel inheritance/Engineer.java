/*Task 5: LivingBeing → Human → Engineer
Create a base class LivingBeing with a method breathe().
Create a derived class Human that inherits LivingBeing and has a method speak().
Create a further derived class Engineer that inherits Human and has a method code().
In main(), create an Engineer object and call all three methods.*/

class LivingBeing
{
void breathe()
{
System.out.println("LivingBeing is breathe");
}
}
class Human extends LivingBeing
{
void speak()
{
System.out.println("Human is speak");
}
}
class Engineer extends Human
{
void code()
{
System.out.println("Engineer code");
}
public static void main(String args[])
{
Engineer e=new Engineer();
e.breathe();
e.speak();
e.code();
}
}