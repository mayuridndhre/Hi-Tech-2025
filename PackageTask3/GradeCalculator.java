//Package:utils--Create a class GradeCalculator with:-A method calculateGrade(int marks)that returns grade(A,B,C,D,F)based on marks

package utils;

public class GradeCalculator {
    public static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }
}
