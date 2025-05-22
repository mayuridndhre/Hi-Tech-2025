//WAP to compute Average of Three nos.
//using method with argument without return

class Avg_Threenos2
{
float firstno;
float secondno;
float thirdno;
float Avg_val;
float add;

void getdata(float f,float s,float t)
{
firstno=f;
secondno=s;
thirdno=t;
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
Avg_Threenos2 a=new Avg_Threenos2();
a.getdata(25,45,65);
a.calc();
a.display();
}
}