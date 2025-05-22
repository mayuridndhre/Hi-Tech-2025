/*Task 3: Student Grade Assignment
Create a class Student with:

A constructor that takes name and rollNo.
Another constructor that also takes grade and calls the first constructor using this().
A display() method to print the details.*/

class Student1
{
String name;
int rollno;
String grade;

Student1(String name,int rollno)
{
this.name=name;
this.rollno=rollno;
}

Student1(String grade)
{
this("Mahi",1);
this.grade=grade;
}

void display()
{
System.out.println(name);
System.out.println(rollno);
System.out.println(grade);
}

public static void main(String args[])
{
Student1 s=new Student1("A");
s.display();
}
}