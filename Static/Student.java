/*Create a class Student consists of name,age,roll,col_name data members. create 3 objects or instance. and display the data for 3 instances without using static.*/

class Student
{
String name;
int age;
int rollno;
String colg_name;

void getdata(String n,int a,int r,String c)
{
name=n;
age=a;
rollno=r;
colg_name=c;
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
Student s=new Student();
Student s1=new Student();
Student s2=new Student();

s.getdata("Mayuri",23,1,"prmitr");
s1.getdata("Mahi",24,2,"prpote");
s2.getdata("Raksha",22,3,"Godeclg");

s.display();
s1.display();
s2.display();

}
}