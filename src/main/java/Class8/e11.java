package Class8;

public class e11 {
    public static void main(String[] args) {

            int[] numbers = {9, 10, 15, 18, 20, 22, 30, 60};
            boolean issorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i]>numbers[i+1]){
                    issorted=false;
                    break;
                }
            }
            System.out.println("is loop sorted " +issorted);
        }
    }
