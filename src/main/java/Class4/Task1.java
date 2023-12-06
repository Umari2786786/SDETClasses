package Class4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner loanamount=new Scanner(System.in);
        System.out.println("Please enter loan amount");
        double loan=loanamount.nextDouble();
        if (loan>200000)
        System.out.println("You not accepted ");
        else if (loan<200000)
            System.out.println("loan not accepted");{

        }
    }
}
