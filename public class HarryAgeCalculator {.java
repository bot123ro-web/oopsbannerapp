public class SamAveragePCMCalculator {

    public static void main(String[] args) {

        // Student Name
        String studentName = "Sam";

        // Marks (Out of 100)
        double mathsMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;

        // Total subjects
        int totalSubjects = 3;

        // Calculate average
        double totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        double averageMarks = totalMarks / totalSubjects;

        // Output
        System.out.println(studentName + "'s average mark in PCM is " + averageMarks);
    }
}