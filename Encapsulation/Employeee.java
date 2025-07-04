/*Task 3: Employee Salary Update
Create an Employee class with:
Private: name, designation, basicSalary.
Add:
Getter and setter for each.
Add a method calculateNetSalary() that adds 10% bonus and 5% tax deduction.*/
public class Employeee
{
private String name;
private String designation;
private int basicSalary;

public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}

public String getDestination()
{
return designation;
}
public void setDestination(String designation)
{
this.designation=designation;
}

public int getBasicSalary()
{
return basicSalary;
}
public void setBasicSalary(int basicSalary)
{
this.basicSalary=basicSalary;
}

public double calculateNetSalary()
{
	double bonus=basicSalary*0.10;
	double tax=basicSalary*0.05;
	return basicSalary + bonus - tax;
}

public static void main(String args[])
{
	Employeee e=new Employeee();
	e.setName("Mahii");
	e.setDestination("Nagpur");
	e.setBasicSalary(30000);
	
	System.out.println("Name of Employee is : "+e.getName()); 
	System.out.println("Destination of Employee is : "+e.getDestination());
	System.out.println("Basic Salary of Employee is : "+e.getBasicSalary());
	System.out.println("Net Salary of Employee is : "+e.calculateNetSalary());
}
}