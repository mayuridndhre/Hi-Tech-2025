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
  Student s = new Student("Mayuri",23, 12, "mayuridandhare62@gmail.com");
  StudentData validator = new StudentData();

if (validator.validation(s) && validator.ageValidation(s)) 
	   {
            System.out.println("Adding a New Student Data:");
            s.showStudent();

            Course c = new Course("Full Stack Development", 40000);
            System.out.println("For the course of:");
            c.display();

            ManageClass m = new ManageClass("PCMCA", "Incomplete");
            m.display();
           } 
		else
 		{
            	System.out.println("Invalid student data. Cannot proceed.");
 		}
}
}