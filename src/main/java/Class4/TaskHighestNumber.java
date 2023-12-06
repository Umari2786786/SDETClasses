package Class4;

public class TaskHighestNumber {
    public static void main(String[] args) {
        int num1=800000;
        int num2=5000;
        int num3=50000;

        if (num1>num2) {

            if (num1 >num3) {
                System.out.println("num1 is largest" +" "+ num1);
            }
            } else if (num2>num3) {
            System.out.println("num2 is largest" +" "+ num2);
        }else{
            if (num2>num3) {
                System.out.println("num2 is largest" +" "+ num2);
            }else{
                System.out.println("num3 is largest" +" "+ num3);
            }

        }
    }
}
