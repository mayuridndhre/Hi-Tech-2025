/*ask: Student Grade Management System using Packages
Objective: Create a Java application that manages student information and calculates their grades using organized packages.
📦 Package Structure and Responsibilities
Package: student--Create a class Student with:--Fields: name, marks--Constructor and getter methods
Package:utils--Create a class GradeCalculator with:-A method calculateGrade(int marks)that returns grade(A,B,C,D,F)based on marks
Package: main--Create a class MainApp with the main method--Instantiate a few Student objects--Use GradeCalculator to compute and display each student’s grade
Expected Output:Student: Alice | Marks: 92 |Grade: A-----Student: Bob|Marks: 67 |Grade: C----Student: Charlie | Marks: 38 | Grade: F */

package student;

public class Student
{
String name;
int marks;

public Student(String name,int marks)
{
this.name=name;
this.marks=marks;
}

public String getName() 
{
  return name;
}

public int getMarks()
{
  return marks;
}
}