package Class4;

import java.util.Scanner;

public class E5ScannerMoreWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = sc.nextLine();
        System.out.println("You're full name is " + fullName);
    }
}