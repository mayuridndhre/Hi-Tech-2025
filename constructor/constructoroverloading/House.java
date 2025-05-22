/*Constructor Overloading Tasks
1️⃣ Create a House class with three constructors:

Default constructor ("Unknown Location", 0 rooms, 0 sqft).
Constructor with location and rooms.
Constructor with all attributes (location, rooms, area).*/

class House
{
String location;
int rooms;
int area;


//Default constructor
House()
{
location="Unknown Location";
rooms=0;
area=0;
}

//parameterized constructor
House(String m,int r)
{
location=m;
rooms=r;
}

//parameterized constructor with three parameters
House(String m,int r,int s)
{
location=m;
rooms=r;
area=s;
}

//method
void show()
{
System.out.println(location);
System.out.println(rooms);
System.out.println(area);
}

public static void main(String args[])
{
House h=new House();
h.show();
House h1=new House("Morshi",4);
h1.show();
House h2=new House("Amravati",5,500);
h2.show();
}
}