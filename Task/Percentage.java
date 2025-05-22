//WAP to calculate Percentage of yourself(consider 10th sub)
//using method without argument without return type

class Percentage
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
Percentage p=new Percentage();
p.getmarks();
p.calc();
p.display();
}
}