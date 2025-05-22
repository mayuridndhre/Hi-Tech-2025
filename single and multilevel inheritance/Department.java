/*Task 4: University → College → Department
Create a parent class University with universityName and method displayUniversity().
Create a child class College that inherits University and has collegeName and method displayCollege().
Create a further child class Department that inherits College and has departmentName with method displayDepartment().
In main(), create a Department object and call all display methods.*/

class University
{
String universityName;
void displayUniversity()
{
System.out.println("University name is :"+universityName);
}
}
class College extends University
{
String collegeName;
void displayCollege()
{
System.out.println("college name is :"+collegeName);
}
}
class Department extends College
{
String departmentName;
void displayDepartment()
{
System.out.println("Department name is :"+departmentName);
}
public static void main(String args[])
{
Department d=new Department();
d.universityName="Sgbau";
d.collegeName="Prmitr";
d.departmentName="MCA";
d.displayUniversity();
d.displayCollege();
d.displayDepartment();
}
}