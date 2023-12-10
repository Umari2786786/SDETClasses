package Class5;

import java.util.Scanner;

public class IfSwitchCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("What would you like to do (+ - * / ) ?");
        String operator = sc.next();

        switch (operator){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid operator - null");
        }
    }
}
