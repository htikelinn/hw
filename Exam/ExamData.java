package Exam;

import java.util.Scanner;

public class ExamData {

    private String subject; // Moved from local to class-level
    // private int totalMark;
    private int studentMark;

    // Constructor to initialize the exam data
    public ExamData() {
        try (Scanner scanner = new Scanner(System.in)) { // Using try-with-resources to ensure scanner is closed
            System.out.print("Enter Subject : ");
            subject = scanner.nextLine(); // Removed 'private' as it's now a class-level field
            System.out.print("Enter Student Mark : ");
            studentMark = scanner.nextInt();
        }
    }

    public String sub() {
        return subject;
    }

    public int studMark() {
        return studentMark;
    }
}