//WAP to calculate Percentage of yourself(consider 10th sub)
//using method with argument without return type

class Percentage2
{
int eng,marathi,hindi,maths,sci,geo,hist;
float total_marks;
float Per;

void getmarks(int e,int m,int h,int m2,int s,int g,int h2)
{
eng=e;
marathi=m;
hindi=h;
maths=m2;
sci=s;
geo=g;
hist=h2;
}

void calc()
{
total_marks=eng+marathi+hindi+maths+sci+geo+hist;
Per=(total_marks/700)*100;
}

void display()
{
System.out.println("Percentage is : "+Per);
}

public static void main(String args[])
{
Percentage2 p=new Percentage2();
p.getmarks(80,70,85,65,75,79,85);
p.calc();
p.display();
}
}