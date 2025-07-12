/*Create a simple Java console application to manage student records including name, marks, grade calculation, and display summary.
📋 Requirements: Create a Student class with the following:
String name
int rollNumber
int[] marks (for 3 subjects)
char grade
Methods: inputDetails(), calculateGrade(), displayDetails()
In the main() method:
Ask the user for the number of students. Create an array of Student objects. For each student:
Accept input (name, roll number, marks)
Calculate total marks and assign grade based on average:
>=90 → A
80–89 → B
70–79 → C
<70 → D
Display all student details
o/p :
Enter number of students: 2
Enter details for Student 1:
Name: Bhushan
Roll No: 101
Marks (3 subjects): 85 90 80
Grade: B
Enter details for Student 2:
Name: Rutuja
Roll No: 102
Marks (3 subjects): 95 92 93
Grade: A
--- Student Summary ---
Name: Bhushan | Roll No: 101 | Grade: B
Name: Rutuja | Roll No: 102 | Grade: A*/

import java.util.Scanner;

class Student 
{
    String name;
    int rollNumber;
    int[] marks = new int[3];
    char grade;

    void inputDetails() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        name = sc.nextLine();  // Assign to class variable

        System.out.print("Roll No: ");
        rollNumber = sc.nextInt();  // Assign to class variable

        System.out.print("Marks (3 subjects): ");
        for (int i = 0; i < 3; i++) 
		{
            marks[i] = sc.nextInt();
        }
    }

    void calculateGrade() 
	{
        int total = 0;
        for (int m : marks) 
		{
            total += m;
        }

        int avg = total / 3;

        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else
            grade = 'D';
    }

    void displayDetails() 
	{
        System.out.println("Name: " + name + " | Roll No: " + rollNumber + " | Grade: " + grade);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int a = sc.nextInt();

        Student[] students = new Student[a];

        for (int i = 0; i < a; i++) 
		{
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();
            students[i].calculateGrade();
        }

        System.out.println("\n--- Student Summary ---");
        for (int i = 0; i < a; i++) 
		{
            students[i].displayDetails();
        }
    }
}
