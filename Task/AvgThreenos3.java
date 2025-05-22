//WAP to compute Average of Three nos.
//using method without argument with return

class Avg_Threenos3
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

float calc()
{
add=firstno+secondno+thirdno;
Avg_val=add/3;
return Avg_val;
}

public static void main(String args[])
{
Avg_Threenos3 a=new Avg_Threenos3();
a.getdata();
System.out.println("Average of three nos is "+a.calc());

}
}