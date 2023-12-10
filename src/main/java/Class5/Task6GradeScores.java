package Class5;

import java.util.Scanner;

public class Task6GradeScores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double firstMarks,midMarks,finalMarks,averageMarks;
        String overallScore;

        System.out.println("Enter your marks for the first quizz 0-100");
        firstMarks= sc.nextDouble();
        System.out.println("Enter your marks for the midterm quizz 0-100");
        midMarks= sc.nextDouble();
        System.out.println("Enter your marks for the final quizz 0-100");
        finalMarks= sc.nextDouble();

        averageMarks=(firstMarks+midMarks+finalMarks)/3;

        if (averageMarks>=90 && averageMarks<=100){overallScore="Grade A";
        }else if (averageMarks>=70 && averageMarks <=90){overallScore="Grade B";
        }else if (averageMarks>=50 && averageMarks <=70){overallScore="Grade C";
        }else if (averageMarks<=50){overallScore="Grade F";
        }else {overallScore="Ungraded, Please enter the correct quizz scored 0-100";}
        System.out.println("you over all grade is: "+overallScore);
    }
}
