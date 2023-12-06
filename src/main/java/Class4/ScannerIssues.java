package Class4;

import java.util.Scanner;

public class ScannerIssues {
    public static void main(String[] args) {

        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println("Enter Name");
        sc.nextLine(); //<< this line has to entered so it asked for name and age - clears the buffer memory
        String fullName=sc.nextLine();
        System.out.println("Your name is "+fullName+" and you are "+age+" old");

    }
}
