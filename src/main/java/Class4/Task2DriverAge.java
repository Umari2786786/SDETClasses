package Class4;

import java.util.Scanner;

public class Task2DriverAge {
    public static void main(String[] args) {
        System.out.println( "Enter Age");
        Scanner sc=new Scanner(System.in);
        double Age=sc.nextDouble();
        if (Age<=18) {
            System.out.println("Not Accepted");
        }else {
            System.out.println("Accepted");
        }
    }
}
