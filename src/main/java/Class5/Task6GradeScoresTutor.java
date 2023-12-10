package Class5;

import java.util.Scanner;

public class Task6GradeScoresTutor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double firstMarks,midMarks,finalMarks,averageMarks;
        char grade;
        System.out.println("Enter your marks for the first quizz 0-100");
        firstMarks= sc.nextDouble();
        System.out.println("Enter your marks for the midterm quizz 0-100");
        midMarks= sc.nextDouble();
        System.out.println("Enter your marks for the final quizz 0-100");
        finalMarks= sc.nextDouble();

        averageMarks=(firstMarks+midMarks+finalMarks)/3;
        if (averageMarks>=90){grade='A';
        }else if (averageMarks>=70){grade='B';
        }else if (averageMarks>=50){grade='C';
        }else {grade='F';}
        System.out.println(grade);
    }
}
