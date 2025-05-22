//Find the smallest no Among three
//by using method with Argument with return type

class Smallestno4
{
float firstno,secondno,thirdno;

void getdata(float f,float s,float t)
{
firstno=f;
secondno=s;
thirdno=t;
}

float calc()
{
if(firstno<secondno && firstno<thirdno)
{
return firstno;
}
else if(secondno<firstno && secondno<thirdno)
{
return secondno;
}
else
{
return thirdno;
}
}

public static void main(String args[])
{
Smallestno4 s=new Smallestno4();
s.getdata(25,37,29);
System.out.println("Smallest no is : "+s.calc());
}
}