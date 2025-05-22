/*Write a Java program to manage bank accounts. The program should:
✔ Keep track of the total number of accounts created using a static variable.
✔ Use a static method to display the total number of accounts.*/
/*and   Write a Java program to track the total number of bank accounts created using a static variable and a static method to display the total count.*/


class Bankaccounts
{
int accsrno;

static int totalaccounts;

void getdata(int a)
{
accsrno=a;

totalaccounts++;
}

static void display()
{
System.out.println("Total no of account created is :"+totalaccounts);
}

public static void main(String args[])
{
Bankaccounts b=new Bankaccounts();
Bankaccounts b1=new Bankaccounts();
Bankaccounts b2=new Bankaccounts();
b.getdata(1);
b1.getdata(2);
b2.getdata(3);

display();
}
}