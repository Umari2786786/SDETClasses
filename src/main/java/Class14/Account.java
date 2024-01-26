package Class14;

public class Account {
    String AccountNumber="123456789";
    double balance=-350;
    String username="user123";
    //private access modifier is not accesible from other classes..only in this class
    private String password="Pass123";

    private void printInfo(){
        //Password can be accessed below
        System.out.println(AccountNumber+" "+password);
    }
    //void = Default Method = can be accessed in same PACKAGE
    //private = only accessed WITHIN same CLASS
    //Public void = can be accessed from anywhere

}
