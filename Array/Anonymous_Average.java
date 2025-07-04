/*Task 3: Calculate Average
Objective: Use an anonymous array to calculate average of numbers.*/

public class Anonymous_Average {
    static double calculateAverage(int a[]) 
	{ 
        int sum = 0;
        
        for (int num : a) 
		{ 
            sum += num;
        }

        return (double) sum / a.length; 
    }

    public static void main(String args[])
	{
        double result = calculateAverage(new int[] {10, 20, 30, 40, 50});
        System.out.println("Average of array elements: " + result);
    }
}
