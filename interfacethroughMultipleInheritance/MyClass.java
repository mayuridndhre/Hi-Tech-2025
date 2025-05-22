/*Task 3: Resolving Default Method Conflict
Create two interfaces A and B with default methods named greet(). Implement both in a class MyClass and resolve the conflict.*/
interface A
{
default void greet()
{
System.out.println("Greet method in A");
}
}
interface B
{
default void greet()
{
System.out.println("Greet method in B");
}
}
class MyClass implements A,B
{
public void greet()
{
A.super.greet();
B.super.greet();
System.out.println("Greet method in MyClass");
}
public static void main(String args[])
{
MyClass m=new MyClass();
m.greet();
}
}
