/*write a program to basic salary of an employee and calculate its gross salary according to following :
basic salary<=10000 : HRA=20%,DA=80%
basic salary<=20000 : HRA=25%,DA=90%
basic salary>20000 : HRA=30%,DA=95%*/

class GrossSal
{
public static void main(String args[])
{
int basicSalary=25000;
double HRA,DA;
double Gross_Salary;
if(basicSalary<=10000)
{
HRA = (20 * basicSalary) / 100.0;
DA=(80*basicSalary)/100.0;
Gross_Salary=basicSalary+HRA+DA;
System.out.println("The gross salary of an employee is :"+Gross_Salary);
}
  else if(basicSalary>10000 && basicSalary<=20000)
  {
  HRA = (25 * basicSalary) / 100.0;
  DA=(90*basicSalary)/100.0;
  Gross_Salary=basicSalary+HRA+DA;
  System.out.println("The gross salary of an employee is :"+Gross_Salary);
  }
else
{
  HRA = (30 * basicSalary) / 100.0;
  DA = (95 * basicSalary) / 100.0;
  Gross_Salary=basicSalary+HRA+DA;
  System.out.println("The gross salary of an employee is :"+Gross_Salary);
}
}
}