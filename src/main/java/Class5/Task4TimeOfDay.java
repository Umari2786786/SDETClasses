package Class5;

import java.util.Scanner;

public class Task4TimeOfDay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the time using 24 hour clock format eg 00.00");
        double time= sc.nextFloat();
        if (time>=00.00&&time<=11.59){
            System.out.println("Its morning here");
        }else if (time>=12.00&&time<=15.59){
            System.out.println("Its the afternoon here");
        }else if (time>=16.00&&time<=20.59){
            System.out.println("Its the evening here");
        }else if (time>=21.00 || (time>=00.00 && time <=23.59)){
            System.out.println("Its night time here");
        }else {
            System.out.println("Sorry an invalid time entered");
        }
    }
}
