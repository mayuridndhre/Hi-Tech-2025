/*Task 2: Employee Salary Calculation
Create a class Employee with:

A constructor that accepts name and basicSalary.
Another constructor that also accepts bonus and calls the first constructor using this().
A method calculateSalary() that prints the total salary.*/

class Employee1
{
String name;
int basicsalary;
int bonus;
int calc_sal;

Employee1(String name,int basicsalary)
{
this.name=name;
this.basicsalary=basicsalary;

}
Employee1(int bonus)
{

this("Mahii",50000);
this.bonus=bonus;
}

void calculateSalary()
{
System.out.println(name);
System.out.println(basicsalary);
System.out.println(bonus);

calc_sal=(basicsalary+bonus);
System.out.println(calc_sal);
}

public static void main(String args[])
{
Employee1 e=new Employee1(5000);
e.calculateSalary();

}
}