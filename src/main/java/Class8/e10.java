package Class8;

public class e10 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
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