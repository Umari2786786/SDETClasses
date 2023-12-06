package Class5;

import java.util.Scanner;

public class Task2Tutor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Day No");
        int daynumber=sc.nextInt();
        if (daynumber>=1&&daynumber<=5) {
            System.out.println("Weekday");

        } else if (daynumber==6 ||daynumber==7) {
        {
                System.out.println("weekend");
            }
        } else if (daynumber>=8) {
            System.out.println("invalid");

        }
    }
}
