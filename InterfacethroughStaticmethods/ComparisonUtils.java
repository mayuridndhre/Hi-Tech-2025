/*🔹 Task 4: Compare Two Numbers
Interface: ComparisonUtils
Task: Create a static method max(int a, int b) that returns the greater of the two numbers.
Test: Demonstrate the method with sample inputs.*/
interface ComparisonUtils
{
static void max(int a,int b)
{
if(a>b)
{
System.out.println("a is greater");
}
else
{
System.out.println("b is greater");
}
}
public static void main(String args[])
{
ComparisonUtils.max(5,9);
}
}
