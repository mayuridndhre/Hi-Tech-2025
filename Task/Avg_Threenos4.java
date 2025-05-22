//WAP to compute Average of Three nos.
//using method with argument with return

class Avg_Threenos4
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

float calc()
{
add=firstno+secondno+thirdno;
Avg_val=add/3;
return Avg_val;
}

public static void main(String args[])
{
Avg_Threenos4 a=new Avg_Threenos4();
a.getdata(25,45,65);
System.out.println("Average of three nos is "+a.calc());
}
}