/*ask 2: Unboxing with Arithmetic Operation
Objective:
Perform arithmetic operations using unboxed values from wrapper objects.
Steps:
Create two Integer objects.
Unbox them and perform addition or subtraction.
Print the result.*/

class Arithmetic
{
	public static void main(String args[])
	{
		Integer a=Integer.valueOf(5);
		Integer b=Integer.valueOf(3);
		
		int sum=a+b;
		int sub=a-b;
		
		System.out.println("Addition of two nos is :"+sum);
		System.out.println("Substraction of two nos is :"+sub);
	}
}
