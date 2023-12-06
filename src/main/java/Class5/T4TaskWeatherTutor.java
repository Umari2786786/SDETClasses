package Class5;

import java.util.Scanner;

public class T4TaskWeatherTutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter month");
        String monthname = sc.next();
        String season;
        if (monthname.equalsIgnoreCase("December")||
                monthname.equalsIgnoreCase("January")||
                monthname.equalsIgnoreCase("Febuary")){
            season= "winter";
    } else if (monthname.equalsIgnoreCase("March")||
                monthname.equalsIgnoreCase("April")||
                monthname.equalsIgnoreCase("May")) {
            season="Spring";
        } else if (monthname.equalsIgnoreCase("June")||
                monthname.equalsIgnoreCase("July")||
                monthname.equalsIgnoreCase("August")) {
            season="Summer";
        } else if (monthname.equalsIgnoreCase("September")||
                monthname.equalsIgnoreCase("October")||
                monthname.equalsIgnoreCase("November")) {
            season = "Autum";
        }else {
            season="invalid";
        }
        System.out.println("you were born "+season);

    }
}
