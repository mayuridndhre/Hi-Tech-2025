public class Main
{
public static void main(String args[])
{
Address add1=new Address("Morshi","Maharashtra","India");
Address add2=new Address("Indore","Madhya Pradesh","India");
Student s1=new Student(101,"Mayuri",add1);
s1.display();
Student s2=new Student(102,"Mahii",add2);
s2.display();
}
}