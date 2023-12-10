package Class5;

import java.util.Scanner;

public class Task5MonthBorn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month you were born");
        String month= sc.next();
        String season;
        if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")){
            season="Spring";
        }else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") ||month.equalsIgnoreCase("August")){
            season="Summer";
        }else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
            season="Autumn";
        }else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")){
            season="Winter";
        }else {
            season="You have entered a invalid month entered!";
        }
        System.out.println("You were born in "+season);
        sc.close();
            }
        }

