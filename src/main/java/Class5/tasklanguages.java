package Class5;

import java.util.Scanner;

public class tasklanguages {
    public static void main(String[] args) {
// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter country");
        String country = scanner.nextLine();
        switch (country){
            case "UK":
                System.out.println("English");
                break;
            case "Dam":
                System.out.println("Dutch");
                break;
            case "Pak":
                System.out.println("Urdu");
                break;
            case "Ind":
                System.out.println("Hindi");
                break;
            case "Germaby":
                System.out.println("German");
                break;
            default:
                System.out.println("lang for " +country+ " in unknown.");
        }
        }
    }

