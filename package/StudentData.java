package utils;
import models.Student;

public class StudentData {

    public boolean validation(Student s) {
        String email = s.email;
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid Email.");
            return true;
        } else {
            System.out.println("Invalid Email.");
            return false;
        }
    }

    public boolean ageValidation(Student s) {
        int rollNo = s.rollNo;
        if (rollNo > 0 && rollNo <= 999) {
            System.out.println("Valid Roll Number.");
            return true;
        } else {
            System.out.println("Invalid Roll Number.");
            return false;
        }
    }
}
