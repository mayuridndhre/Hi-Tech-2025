/*JaggedArray : - Task 1: Store and Print Student Marks for Different Subjects
Objective:
Create a jagged array where each row represents a student and each column represents marks in different subjects. The number of subjects is different for each student.*/

public class StudentMarks
{
public static void main(String args[])
	{
		int[][] st={
			{90,85},
			{78,88,92},
			{67}
		};
		
		System.out.println("Student Marks");
		for(int i=0;i<st.length;i++)
		{
			
			for(int j=0;j<st[i].length;j++)
			{
			System.out.print(st[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
