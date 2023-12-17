package Class11;

public class EUTask1 {
    public static void main(String[] args) {

        String username = "umari2786";
        String password = "Password123!";
        String password2 ="Password123!";


        if (username.isEmpty()||password.isEmpty()){
            System.out.println("username or password must not be empty");
        }else if (password.length()<8){
            System.out.println("username must have minimum 8 character");
        }else if (password.contentEquals(username)){
            System.out.println("password must not contain username");
        }else if (!password.equals (password2)){
            System.out.println("Password not matching");}
        else {
            System.out.println("username and password created");
        }



    }
}