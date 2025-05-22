//WAP to calculate Percentage of yourself(consider 10th sub)
//using method without argument with return type

class Percentage3
{
int eng,marathi,hindi,maths,sci,geo,hist;
float total_marks;
float Per;

void getmarks()
{
eng=80;
marathi=70;
hindi=85;
maths=65;
sci=75;
geo=79;
hist=85;
}

float calc()
{
total_marks=eng+marathi+hindi+maths+sci+geo+hist;
Per=(total_marks/700)*100;
return Per;
}
public static void main(String args[])
{
Percentage3 p3=new Percentage3();
p3.getmarks();
System.out.println("Percentage is : "+p3.calc());
}
}