import java.util.Scanner;

class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Full Name of Student :");
String name=sc.nextLine();

System.out.println("Enter Age no :");
int age=sc.nextInt();

System.out.println("Enter Roll No :");
double roll=sc.nextDouble();

System.out.println(" Enter First Name only :");
String firstname=sc.next();

System.out.println("Check Boolean value :");
Boolean check=sc.nextBoolean();

System.out.println("Student Full name is  :"+name);
System.out.println("Age is  :"+age);
System.out.println("Roll NO is  :"+roll);
System.out.println("First name is  :"+firstname);
System.out.println("Check value is :"+check);
}
}
