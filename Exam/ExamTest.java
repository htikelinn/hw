package Exam;

public class ExamTest {
    public static void main(String[] args) {
        // Create an instance of the Exam class
        int tMark = 100;
        ExamData exam = new ExamData();
        // ExamData(sub, tMark,);
        // Display the exam details
        System.out.println("Exam Name: " + exam.sub());
        System.out.println("Total Marks: " + tMark);
        System.out.println("Passing Marks: " + exam.studMark());

        // Check if a student has passed with a score of 60
        // int studentScore = 60;
        if (exam.studMark() >= 80) {
            System.out.println("The student has passed the exam with Grade A");
        } else if (exam.studMark() >= 60) {
            System.out.println("The student has passed the exam with Grade B.");
        } else if (exam.studMark() >= 40) {
            System.out.println("The student has passed the exam with Grade C");
        } else {
            System.out.println("The student has failed with Grade D");
        }
    }
}
