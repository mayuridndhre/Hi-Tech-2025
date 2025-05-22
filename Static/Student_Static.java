/*Create a class Student consists of name,age,roll,col_name data members. create 3 objects or instance. and display the data for 3 instances with using static.*/

class Student_Static
{
String name;
int age;
int rollno;

static String colg_name="prmitr";

void getdata(String n,int a,int r)
{
name=n;
age=a;
rollno=r;

}

void display()
{
System.out.println("Name of student is :"+name);
System.out.println("Age is :" +age);
System.out.println("Roll no is :"+rollno);
System.out.println("College name is :"+colg_name);
}

public static void main(String args[])
{
Student_Static s=new Student_Static();
Student_Static s1=new Student_Static();
Student_Static s2=new Student_Static();

s.getdata("Mayuri",23,1);
s1.getdata("Mahi",24,2);
s2.getdata("Raksha",22,3);

s.display();
s1.display();
s2.display();

}
}