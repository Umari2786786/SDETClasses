package Class5;

import java.util.Scanner;

public class Task3Tutor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int hournumbers=sc.nextInt();

        if (hournumbers>=1 && hournumbers<=11) {
            System.out.println("morning");
        } else if (hournumbers>=12&&hournumbers<=15) {
            System.out.println("Afternoon");
        } else if (hournumbers>=16&&hournumbers<=20) {
            System.out.println("evening");
        } else if (hournumbers>=21&&hournumbers<=24) {
            System.out.println("Night");
        }else{
            System.out.println("invalid");
    }
    }
    }
