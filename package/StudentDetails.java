/*Practice Task 2: Package - students
Objective: Organize student data and calculate results.
Create a package students.
Add a class StudentDetails with fields like name, rollNo, marks[].
Add a method displayDetails() and calculateAverage().
Create a main class in another package report to use StudentDetails.*/
package students;
public class StudentDetails
{
String name;
int rollNo;
int marks;
public void displayDetails()
{
name="Mayuri";
rollNo=12345;
marks=80;
System.out.println(name);
System.out.println(rollNo);
System.out.println(marks);
}
public void calculateAverage()
{
System.out.println("Average");
}
}