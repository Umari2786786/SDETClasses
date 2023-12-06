package Class11;

import java.util.Scanner;

public class E5Task1 {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String storedUsername = "Username";
            String storedPassword = "Password123";

            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredUsername.isEmpty() || enteredPassword.isEmpty() ||
                    enteredUsername.length() < 8 || enteredPassword.length() < 8) {
                System.out.println("Username and password cannot be empty");
            } else {
                if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }
            scanner.close();
        }
    }


