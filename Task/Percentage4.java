//WAP to calculate Percentage of yourself(consider 10th sub)
//using method with argument with return type

class Percentage4
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

float calc()
{
total_marks=eng+marathi+hindi+maths+sci+geo+hist;
Per=(total_marks/700)*100;
return Per;
}
public static void main(String args[])
{
Percentage4 p4=new Percentage4();
p4.getmarks(80,70,85,65,75,79,85);
System.out.println("Percentage is : "+p4.calc());
}
}