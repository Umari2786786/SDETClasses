package Class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 1000");
        double number = sc.nextDouble();
        if (number>=1&&number<=10){
            System.out.println("Its a small number");
        }else if (number>=11&&number<=100){
            System.out.println("Its a medium number");
        }else if (number>=101&&number<=1000){
            System.out.println("Its a Larger number");
        }else if (number==0) {
            System.out.println("0 is simply 0");
        }else {
            System.out.println("You have entered a number outside of what was asked!");
        }
    }
}
