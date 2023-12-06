package Class4;

import java.util.Scanner;

public class TaskTempConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter City");
        String city=sc.nextLine();
        System.out.println("enter temp in "+city);
        double temp=sc.nextDouble();
        double tempInCelcius=(temp-32)+5.0/9.0;
        System.out.println("temp in "+city+" is "+tempInCelcius+"C");

    }
}
