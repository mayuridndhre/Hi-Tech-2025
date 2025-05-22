/*Constructor with all attributes (location, rooms, area).
2️⃣ Develop a Person class with three constructors:

Default constructor with "Unknown Name" and 0 age.
Constructor with name.
Constructor with name and age.*/

class Person1
{
String name;
int age;

//Default constructor
Person1()
{
name="Unknown name";
age=0;
}

//parameterized constructor
Person1(String n)
{
name=n;
}

//parameterized constructor with three parameters
Person1(String n,int a)
{
name=n;
age=a;
}

//method
void show()
{
System.out.println(name);
System.out.println(age);

}

public static void main(String args[])
{
Person1 h=new Person1();
h.show();
Person1 h1=new Person1("Mayuri");
h1.show();
Person1 h2=new Person1("Mahi",23);
h2.show();
}
}