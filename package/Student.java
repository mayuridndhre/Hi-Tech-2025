/*Task 1: Student Management System
Create a package models for classes like Student and Course.
Create a package services with a class to manage student enrollment and course assignment.
Create a utils package to validate student data (e.g., age, email).
Use a main class in a separate package to test the flow.*/

package models;
public class Student
{
public String name;
public int age;
public int rollNo;
public String email;

public Student(String name,int age,int rollNo,String email)
{
this.name=name;
this.age=age;
this.rollNo=rollNo;
this.email=email;
}

public void showStudent()
{
System.out.println("Name of Student is :"+name);
System.out.println("Age of Student is :"+age);
System.out.println("RollNo of Student is :"+rollNo);
System.out.println("Email of Student is :"+email);
}
}