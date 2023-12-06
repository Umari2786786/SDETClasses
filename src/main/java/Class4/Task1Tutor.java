package Class4;

import java.util.Scanner;

public class Task1Tutor {
    public static void main(String[] args) {
        System.out.println( "enter amount required");
        Scanner sc=new Scanner(System.in);
        double loanAmount=sc.nextDouble();
        if (loanAmount<=200000) {
            System.out.println("accepted");
        }else {
            System.out.println("not accepted");
        }

    }
}
