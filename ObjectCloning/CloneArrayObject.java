/*Task 3: Clone an Array of Objects
Objective:
Create an array of Employee objects. Clone one of the objects, change its field, and show that other objects are not affected.

The goal is to create a Java program that demonstrates object cloning using an array of Employee objects. First, you'll define an Employee class with
 some fields like name and salary. Then, you'll create an array and fill it with multiple Employee objects. After that, you will clone one of these objects
 using the clone() method. Once you have the cloned copy, you will modify one or more fields of the cloned object. Finally, you'll print the original and cloned 
 objects to show that changing the cloned object does not affect the original one — proving that a deep copy or independent copy was made, depending on how cloning was implemented. 
 This helps demonstrate how cloning works in object-oriented programming*/
 
 class Employee implements Cloneable
 {
 String name;
 int salary;
 
 Employee(String name,int salary)
 {
 this.name=name;
 this.salary=salary;
 }
 
 @Override
 public Employee clone()
 {
	try
	{
	return(Employee)super.clone();
	}
	catch(CloneNotSupportedException e)
	{
	return null;
	}
 }
 
 void display()
 {
 System.out.println("Name:" +name+ ",Salary:" +salary);
 }
 }
 public class CloneArrayObject
 {
 public static void main(String args[])
 {
	Employee employees[]=new Employee[3];
	employees[0]=new Employee("Mayuri",50000);
	employees[1]=new Employee("Mahii",70000);
	employees[2]=new Employee("Mayu",560000);
	
	Employee cloneEmp=employees[1].clone();
	
	if(cloneEmp != null)
	{
	cloneEmp.name="Krushnai";
	cloneEmp.salary=45000;
	}
	
	System.out.println("Original Employees:");
	for(Employee e: employees)
	{
		e.display();
	}
	
	System.out.println("Cloned and Modified Employees:");
	cloneEmp.display();
 }
 }