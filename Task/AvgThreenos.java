//WAP to compute Average of Three nos.
//using method without argument without return

class Avg_Threenos
{
float firstno;
float secondno;
float thirdno;
float Avg_val,add;

void getdata()
{
firstno=25;
secondno=45;
thirdno=65;
}

void calc()
{
add=firstno+secondno+thirdno;
Avg_val=add/3;
}

void display()
{
System.out.println("Average of three nos is "+Avg_val);
}


public static void main(String args[])
{
Avg_Threenos a=new Avg_Threenos();
a.getdata();
a.calc();
a.display();
}
}