//T.1 Create a package services with a class to manage student enrollment and course assignment.

package services;
import models.Student;
import models.Course;

public class ManageClass
{

String enrollmentNo;
String assignment;

public ManageClass(String enrollmentNo,String assignment)
{
this.enrollmentNo=enrollmentNo;
this.assignment=assignment;
}

public void display()
{
System.out.println("Student enrollment No is "+enrollmentNo);
System.out.println("Student Assigment is "+assignment);
}
}