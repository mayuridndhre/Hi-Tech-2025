//Package: main--Create a class MainApp with the main method--Instantiate a few Student objects--Use GradeCalculator to compute and display each student’s grade

package main;

import student.Student;
import utils.GradeCalculator;

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 92);
        Student s2 = new Student("Bob", 67);
        Student s3 = new Student("Charlie", 38);

        displayGrade(s1);
        displayGrade(s2);
        displayGrade(s3);
    }

    public static void displayGrade(Student student) {
        String grade = GradeCalculator.calculateGrade(student.getMarks());
        System.out.println("Student: " + student.getName() + " | Marks: " + student.getMarks() + " | Grade: " + grade);
    }
}
