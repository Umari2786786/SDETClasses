package Class4;

import java.util.Scanner;

public class Task2DriverAgeTutor {
    public static void main(String[] args) {

        Scanner SC=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=SC.nextInt();

        if (age>=18) {
            System.out.println("Issued");
        }else {
            System.out.println("sorry try later");

        }


    }
}
