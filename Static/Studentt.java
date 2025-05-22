/*Create a class Student consists of name,age,roll,col_name data members. create 3 objects or instance. and display the data for 3 instances with using static.*/
 class Studentt
{
String name;               //variable/instance declaration
int age;                   //variable/instance declaration
int rollno;                //variable/instance declaration
static String col_name;    //static variable/instance declaration 

void display()             //method defination without argument
{
System.out.println("Name of student is :"+name);
System.out.println("Age of student is :"+age);
System.out.println("Rollno of student is :"+rollno);
}

public static void main(String args[])   //main method
{
Studentt s=new Studentt();            //object/ creation
Studentt s1=new Studentt();             //object creation
Studentt s2=new Studentt();            //object creation

s.name="Mayuri";         //variable initialization
s.age=23;                 //variable initialization
s.rollno=1;               //variable initialization
col_name="prmitr";          //static variable initialization
s.display();                //method call or calling method
System.out.println("College name of student is :"+col_name);
System.out.println("------------------------------");


s1.name="Mahi";
s1.age=22;
s1.rollno=2;
col_name="prpote";
s1.display();
System.out.println("College name of student is :"+col_name);
System.out.println("--------");


s1.name="Raksha";
s1.age=21;
s1.rollno=3;
s1.display();
System.out.println("College name of student is :"+col_name);
System.out.println("------------------------------");

s2.name="Sameer";
s2.age=23;
s2.rollno=4;
s2.col_name="Godeclg";
s2.display();
System.out.println("College name of student is :"+col_name);
System.out.println("------------------------------");
}
}