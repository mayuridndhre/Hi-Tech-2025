//Create a class student consists of name,age,roll,col_name data members. create 3 objects or instance. and display the data for 3 instances with using static and without using static.
class student{
	String name;
	static String col_name;
	int age;
	int roll;
	
	void display(){

		System.out.println("Name  :"+name);
		System.out.println("Age :"+age);
		System.out.println("Roll number :"+roll);
		System.out.println("collage :"+col_name);
		System.out.println("......................");
	}

	public static void main(String args[]){
		studentja p1=new student();
		student p2=new student();
		student p3=new student();
		//Acc. value
		p1.col_name="Prof Ram Meghe collage Badnera";
		p1.name="Rohan";
		p2.name="Harsha";
		p3.name="Tejas";
		p1.age=23;
		p2.age=22;
		p3.age=24;
		p1.roll=1;
		p2.roll=2;
		p3.roll=3;

		//colling method
		p1.display();
		p2.display();
		p3.display();

		p2.col_name="P.R.Pote";

		//colling method
		p1.display();
		p2.display();
		p3.display();

		p3.col_name="HVPM";

		//colling method
		p1.display();
		p2.display();
		p3.display();
		
	}
}
		
 