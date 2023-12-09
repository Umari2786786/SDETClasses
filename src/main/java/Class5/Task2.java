package Class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day in number form 1-7 ");
        int daynumber = sc.nextInt();
        if (daynumber >= 1 && daynumber <= 5) {
            System.out.println("Its a weekday");
        }else if (daynumber==6||daynumber==7){
            System.out.println("Its the weekend");
        }else {
            System.out.println("Invalid day number Entered");
        }
    }
}
