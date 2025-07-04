//Write a program to count how many even and how many odd numbers are present in an array.

class EvenOdd
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6,7,8,9,10};
int even=0;
int odd=0;

for(int i:arr)
{
if(i%2==0)
{
even++;
}
if(i%2!=0)
{
odd++;
}
}
System.out.println("Even no is :"+even+ " and odd no is :"+odd);
}
}
