class Student
{
int roll;
String name;
Address add;

public Student(int roll,String name,Address add)
{
this.roll=roll;
this.name=name;
this.add=add;
}

void display()
{
System.out.println(roll+" "+name);
System.out.println(add.city+" "+add.state+" "+add.country);
}
}