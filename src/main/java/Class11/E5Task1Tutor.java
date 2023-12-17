package Class11;

public class E5Task1Tutor {
    public static void main(String[] args) {

        String username="user123";
        String password="pass4123";
        String confirmPassword="pass4123";

        if (username.isEmpty() || password.isEmpty()){
            System.out.println("username empty");}
        else if (password.length()<8) {
            System.out.println("Password to short");}
        else if (password.contains(username)) {
            System.out.println("Password cant contain username");}
        else if (!password.equals(confirmPassword)) {
            System.out.println("Password not matching");}
        else {System.out.println("username and password created");
    }
    }
    }
