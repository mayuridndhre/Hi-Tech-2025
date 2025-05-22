/*3. Hierarchical Inheritance - Hospital Management System
Problem Statement:
Create a Hospital Management System where:
A Person class stores details like name and age.
Doctor class (inherits Person) adds specialization and consultationFee.
Patient class (inherits Person) adds disease and admissionDate.
Implement methods:
displayDetails() in each class to show specific information.
Expected Output Example:
Doctor Details: Dr. Smith | Specialization: Cardiologist | Fee: $500  
Patient Details: John Doe | Disease: Heart Disease | Admitted on: 25-Mar-2025*/

class Person
{
String name;
int age;
void displayDetails()
{
System.out.println("Name of Person is :"+name);
System.out.println("Age of Person is :"+age);
}
}
class Doctor extends Person
{
String specialization;
int consultationFee;

void displayDetails()
{
System.out.println("Doctor Details:"+name+" | Specializatoin :"+specialization+ " | Fee: "+consultationFee);
}
}
class Patient extends Person
{
String disease;
int admissionDate;
void displayDetails()
{
System.out.println("Patient Details:"+name+" | Disease :"+disease+ " | Admitted on : "+admissionDate);
}
public static void main(String args[])
{

Doctor d=new Doctor();
d.name="Dr. Smith";
d.specialization=" Cardiologist";
d.consultationFee=500;
d.displayDetails();

Patient p=new Patient();
p.name="John Doe";
p.disease="Heart Disease";
p.admissionDate=25;
p.displayDetails();
}
}