/* Create a student class with name,age,and grade.The defalult constructor should set name="Not Assigned",age=0, and grade="Not Assigned".Write a method to print details.*/

 class Student
{
String name;
int age;
String grade;

Student()
{
name="Not Assigned";
age=0;
grade="Not Assigned";
}

void display()
{
System.out.println("The name of Student is "+name);
System.out.println("The age of Student is "+age);
System.out.println("The grade of Student is "+grade);
}

public static void main(String args[])
{
Student s=new Student();
s.display();
}
}