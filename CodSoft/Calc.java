import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Grade Calculator");
        System.out.print("Please enter your number of subjects: ");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects.");
            return;
        }

        double Total = 0;
        double AvgPer;
        char grade;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Obtained marks in subject " + i + ": ");
            double marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Please Enter Marks in between 0 to 100");
                return;
            }

            Total += marks;
        }

        AvgPer = Total / numSubjects;

        if (AvgPer >= 90) {
            grade = 'A';
        } else if (AvgPer >= 80) {
            grade = 'B';
        } else if (AvgPer >= 70) {
            grade = 'C';
        } else if (AvgPer >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + Total);
        System.out.println("Your Average Percentage is " + AvgPer + "%");
        System.out.println("Your grade is " + grade);
    }
}
