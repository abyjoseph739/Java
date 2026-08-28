// Task 1 - University Evaluation System
// Demonstrates abstract class, abstract methods,
// method overriding and runtime polymorphism.

abstract class StudentEvaluation {

    protected int studentId;
    protected String studentName;
    protected String courseName;
    protected double internalMarks;
    protected double externalMarks;

    // Constructor
    public StudentEvaluation(int studentId, String studentName,
                             String courseName, double internalMarks,
                             double externalMarks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    // Concrete method
    public void displayDetails() {

        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + studentName);
        System.out.println("Course         : " + courseName);
        System.out.println("Internal Marks : " + internalMarks);
        System.out.println("External Marks : " + externalMarks);
    }

    // Abstract methods
    public abstract double calculateTotal();

    public abstract void displayGrade();
}


// Undergraduate course evaluation
class UGCourseEvaluation extends StudentEvaluation {

    public UGCourseEvaluation(int studentId, String studentName,
                              String courseName, double internalMarks,
                              double externalMarks) {

        super(studentId, studentName, courseName,
              internalMarks, externalMarks);
    }

    @Override
    public double calculateTotal() {

        // UG: Internal + External
        return internalMarks + externalMarks;
    }

    @Override
    public void displayGrade() {

        double total = calculateTotal();

        if (total >= 90)
            System.out.println("Grade          : A+");
        else if (total >= 80)
            System.out.println("Grade          : A");
        else if (total >= 70)
            System.out.println("Grade          : B");
        else if (total >= 60)
            System.out.println("Grade          : C");
        else if (total >= 50)
            System.out.println("Grade          : D");
        else
            System.out.println("Grade          : F");
    }
}


// Postgraduate course evaluation
class PGCourseEvaluation extends StudentEvaluation {

    public PGCourseEvaluation(int studentId, String studentName,
                              String courseName, double internalMarks,
                              double externalMarks) {

        super(studentId, studentName, courseName,
              internalMarks, externalMarks);
    }

    @Override
    public double calculateTotal() {

        // PG: 30% internal + 70% external
        return (internalMarks * 0.30) + (externalMarks * 0.70);
    }

    @Override
    public void displayGrade() {

        double total = calculateTotal();

        if (total >= 85)
            System.out.println("Grade          : A+");
        else if (total >= 75)
            System.out.println("Grade          : A");
        else if (total >= 65)
            System.out.println("Grade          : B");
        else if (total >= 55)
            System.out.println("Grade          : C");
        else
            System.out.println("Grade          : F");
    }
}


// Certificate course evaluation
class CertificateCourseEvaluation extends StudentEvaluation {

    public CertificateCourseEvaluation(int studentId, String studentName,
                                       String courseName,
                                       double internalMarks,
                                       double externalMarks) {

        super(studentId, studentName, courseName,
              internalMarks, externalMarks);
    }

    @Override
    public double calculateTotal() {

        // Certificate: 50% internal + 50% external
        return (internalMarks * 0.50) + (externalMarks * 0.50);
    }

    @Override
    public void displayGrade() {

        double total = calculateTotal();

        if (total >= 80)
            System.out.println("Grade          : Distinction");
        else if (total >= 60)
            System.out.println("Grade          : First Class");
        else if (total >= 50)
            System.out.println("Grade          : Pass");
        else
            System.out.println("Grade          : Fail");
    }
}


// Main class
public class Task1UniversityEvaluation {

    public static void main(String[] args) {

        // Creating five student objects
        StudentEvaluation[] students = {

            new UGCourseEvaluation(
                101, "Aby", "BCA", 35, 52),

            new UGCourseEvaluation(
                102, "Rahul", "BCA", 32, 48),

            new PGCourseEvaluation(
                201, "Anu", "MCA", 27, 60),

            new PGCourseEvaluation(
                202, "Arjun", "MCA", 25, 55),

            new CertificateCourseEvaluation(
                301, "Meera", "Java Programming", 42, 45)
        };


        System.out.println("==============================================");
        System.out.println("       UNIVERSITY EVALUATION SYSTEM");
        System.out.println("==============================================");


        // Loop through all students
        for (StudentEvaluation student : students) {

            System.out.println("\n----------------------------------------------");

            student.displayDetails();

            System.out.printf("Total Marks    : %.2f%n",
                              student.calculateTotal());

            student.displayGrade();
        }


        System.out.println("\n==============================================");
        System.out.println("       Evaluation Completed");
        System.out.println("==============================================");
    }
}