
//Write a program that finds and prints the largest number in a given integer array

class LargestNo
{
public static void main(String args[])
{
int arr[]={1,3,4,5,6};
int max=arr[0];

for(int i:arr)
{
if(i>max)
{
max=i;
}
}
System.out.println("Max no is : "+max);
}
}