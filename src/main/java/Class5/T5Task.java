package Class5;

import java.util.Scanner;

public class T5Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quizmarks, midmarks, finalmarks, avemarks;
        char grade = 0;
        System.out.println("enter quiz 0-100");
        quizmarks = sc.nextDouble();
        System.out.println("enter midterm 0-100");
        midmarks = sc.nextDouble();
        System.out.println("enter Final 0-100");
        finalmarks = sc.nextDouble();
        avemarks = (quizmarks + midmarks + finalmarks) / 3;

        if (avemarks >= 90) {
            grade = 'A';
        } else if (avemarks >= 70) {
            grade = 'B';
        } else if (avemarks >= 50) {
            grade = 'C';
        } else if (avemarks >= 30) {
            grade = 'D';
    }
        System.out.println(grade);
    }
}


