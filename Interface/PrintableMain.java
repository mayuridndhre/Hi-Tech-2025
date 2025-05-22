/*Task 2: Printable Interface
Objective: Interface with multiple classes using same method.
Create an interface Printable with a method print().
Create two classes Book and Magazine that implement Printable.
In main, call print() for both and show different messages for each.*/
interface Printable
{
void print();
}
class Book implements Printable
{
public void print()
{
System.out.println("Book class");
}
}
class Magazine implements Printable
{
public void print()
{
System.out.println("Magazine class");
}
}
class PrintableMain
{
public static void main(String args[])
{
Printable p;

p=new Book();
p.print();

p=new Magazine();
p.print();
}
}
