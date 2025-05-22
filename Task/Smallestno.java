//Find the Smallest Number Among Three
//by using method without argument without return type

class Smallestno
{
float firstno;
float secondno;
float thirdno;

void getdata()
{
firstno=25;
secondno=37;
thirdno=29;
}

void calc()
{
if(firstno<secondno && firstno<thirdno)
{
  System.out.println("smallest no is "+firstno);   
}
else if(secondno<firstno && secondno<thirdno)
{
System.out.println("Smallest no is "+secondno);
}
else
{
System.out.println("Smallest no is "+thirdno);
}
}

public static void main(String args[])
{
Smallestno s=new Smallestno();
s.getdata();
s.calc();
}
}