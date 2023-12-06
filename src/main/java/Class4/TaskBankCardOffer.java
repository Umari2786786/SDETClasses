package Class4;

import java.util.Scanner;

public class TaskBankCardOffer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you have a card? (type Yes or No): ");
        String hasCard = scanner.nextLine().toLowerCase();
        if (hasCard.equals("yes")) {
            System.out.print("Enter your card balance: ");
            double balance = scanner.nextDouble();
            if (balance > 1000) {
                System.out.println("Your balance is over 1000. Please pay this immediately.");
            } else {
                System.out.println("You can spend");
            }
        } else {
            System.out.println("You don't have a card. Apply for one");
        }

    }
}
