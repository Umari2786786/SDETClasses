package Class6;

import java.util.Scanner;

public class EU12ScannerAndLoops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number....any number");
        int start=sc.nextInt();

        System.out.println("Enter higher then the number enter before");
        int end=sc.nextInt();

        System.out.println("Enter higher then the number enter before");
        int step=sc.nextInt();

        while (start<=end){
            System.out.print(start+" ");
            start=start+step;
        }




    }
}
