package Class4;

import java.util.Scanner;

public class E7ScannerGender {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter gender");
        char gender=SC.next().charAt(0);
        System.out.println("you gender is "+gender);

    }
}
