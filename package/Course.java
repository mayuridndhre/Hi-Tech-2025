//T.1 Create a package models for classes like Student and Course.

package models;
public class Course
{
String courseName;
int fee;

public Course(String courseName,int fee)
{
this.courseName=courseName;
this.fee=fee;
}

public void display()
{
System.out.println("Name of Course is :"+courseName);
System.out.println("Fee of course is :"+fee);
}
}