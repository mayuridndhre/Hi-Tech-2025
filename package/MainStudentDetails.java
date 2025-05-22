//Create a main class in another package report to use StudentDetails.*/

package students2;
import students.StudentDetails;

class MainStudentDetails
{
public static void main(String args[])
{
StudentDetails s=new StudentDetails();
s.displayDetails();
s.calculateAverage();
}
}