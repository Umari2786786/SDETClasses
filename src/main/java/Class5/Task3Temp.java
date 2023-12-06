package Class5;

import java.util.Scanner;

public class Task3Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quiz score: ");
        double quizScore = scanner.nextDouble();
        System.out.print("Enter mid-term score: ");
        double midtermScore = scanner.nextDouble();
        System.out.print("Enter final score: ");
        double finalScore = scanner.nextDouble();
        double average = (quizScore + midtermScore + finalScore) / 3;
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70 && average < 90) {
            grade = 'B';
        } else if (average >= 50 && average < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Your average score is: " + average);
        System.out.println("Your grade is: " + grade);
    }
}
