package Class5;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter height");
        double height=sc.nextDouble();
        if (height<60) {
            System.out.println("short");
        }else if (height>=60 && height<72) {
        }else{
            System.out.println("tall");
        }
    }
}
