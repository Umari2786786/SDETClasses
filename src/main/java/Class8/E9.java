package Class9;

public class E9 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
        }
        System.out.println("even numbers: " + even);
        System.out.println("odd numbers: " + odd);
    }
}