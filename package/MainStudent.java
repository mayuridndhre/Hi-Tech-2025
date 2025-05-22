//T.1 Use a main class in a separate package to test the flow.*/
package mainStudent;
import models.Student;
import models.Course;
import services.ManageClass;
import utils.StudentData;

class MainStudent
{
public static void main(String args[])
{
Student s=new Student("Mayuri",12,"mayuridandhare62@gmail.com");
Course c=new Course("Full Stack Development",40000);
System.out.println("Adding a New Student Data : ");
s.showStudent();
System.out.println("For the course of : ");
c.display();

ManageClass m=new ManageClass("PCMCA","Incomplete");
m.display();

StudentData s1=new StudentData();
s1.validation(s);
s1.ageValidation(s);

}
}