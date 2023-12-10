package Class5;

import java.util.Scanner;

public class SwitchTaskGradeExplained {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade achieved");
        String grade = sc.nextLine().toLowerCase();

        switch (grade){
            case "a":
                System.out.println("Excellent Grade");
                break;
            case "b":
                System.out.println("Good Grade");
                break;
            case "c":
                System.out.println("Alright Grade");
                break;
            case "d":
                System.out.println("Bad Grade");
                break;
            default:
                System.out.println("Massive Failure Grade");}
    }
}
