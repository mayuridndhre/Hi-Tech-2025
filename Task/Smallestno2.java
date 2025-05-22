//Find the smallest no Among three
//by using with Argument without return type

class Smallestno2
{
float firstno,secondno,thirdno;

void getdata(float f,float s,float t)
{
firstno=f;
secondno=s;
thirdno=t;
}

void calc()
{
if(firstno<secondno && firstno<thirdno)
{
System.out.println("Smallest no is :"+firstno);
}
else if(secondno<firstno && secondno<thirdno)
{
System.out.println("Smallest no is :"+secondno);
}
else
{
System.out.println("Smallest no is :"+thirdno);
}
}

public static void main(String args[])
{
Smallestno2 s=new Smallestno2();
s.getdata(25,37,29);
s.calc();
}
}