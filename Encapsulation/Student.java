/*Task 1: Student Information System
Create a Student class with private variables:
name, rollNumber, and marks.
Add:
Getters and setters.
Validate that marks cannot be negative or more than 100.*/

public class Student
{
 private String name;
 private int rollNumber;
 private int marks;
 
 public String getName()
 {
  return name;
 }
 
 public void setName(String name)
 {
 this.name=name;
 }
 
 public int getrollNumber()
 {
  return rollNumber;
 }
 
 public void setrollNumber(int rollNumber)
 {
 this.rollNumber=rollNumber;
 }
 
 public int getMarks()
 {
  return marks;
 }
 
 public void setMarks(int marks)
 {
 if(marks>=0 && marks<=100)
 {
     this.marks=marks;	 
 }
 else
 {
	 System.out.println("Invalid marks : Marks must be between 0 to 100 ");
 }
 }
 public static void main(String args[])
 {
	Student s=new Student();
    s.setName("Mayuri");
    s.setrollNumber(12);
    s.setMarks(88);
	System.out.println("Student Name is : "+s.getName());
	System.out.println("Student RollNumber is : "+s.getrollNumber());
	System.out.println("Student Marks is : "+s.getMarks());
	s.setMarks(177);
 }
 
}
 