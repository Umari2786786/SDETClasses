package Class8;

import java.util.Scanner;

public class ArraysScanner {
    public static void main(String[] args) {

        int [] numbers=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i < numbers.length; i++){
            System.out.println("enter number"+(i+1));
            numbers[i]= scanner.nextInt();}
        System.out.println("all the numbers entered");
        for (int i =0; i <numbers.length; i++){
            System.out.println(numbers[i]+" ");
        }
    }
}
