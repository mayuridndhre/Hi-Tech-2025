//T.1 Create a utils package to validate student data (e.g., age, email).
package utils;
import models.Student;

public class StudentData
{

public void validation(Student s)
{

if(s.email == s.email)
{
System.out.println("Valid email "+s.email);
}
else
{
System.out.println("Invalid email id ");
}
}

public void ageValidation(Student s)
{
if(s.age == s.age)
{
System.out.println("Valid Age "+s.age);
}
else
{
System.out.println("Invalid Age ");
}

}
}