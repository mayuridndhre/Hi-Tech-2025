//Find the smallecst no Among three
//by using method without Argument with return type

class Smallestno3
{
float firstno,secondno,thirdno;

void getdata()
{
firstno=25;
secondno=37;
thirdno=29;
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
Smallestno3 s=new Smallestno3();
s.getdata();
System.out.println("Smallest no of three is : "+s.calc());
}
}