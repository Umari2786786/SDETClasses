package Class5;

import java.util.Scanner;

public class SwitchTask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Country");
        String country=sc.next().toLowerCase();

        switch (country) {
            case "england":
            System.out.println("English is spoken in this country");
            break;
            case "america":
                System.out.println("American English is spoken in this country");
                break;
            case "pakistan":
                System.out.println("Urdu/Punjabi is spoken in this country");
                break;
            case "germany":
                System.out.println("German is spoken in this country");
                break;
            case "holland":
                System.out.println("Dutch is spoken in this country");
                break;
            case "dubai":
                System.out.println("Arabic is spoken in this country");
                break;
            default:
                System.out.println("Invalid country entered or database not updated for this country");
        }
    }
}
