package Class8;

public class E3ArraysevennumbersAdd {
    public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 45, 55, 25, 80, 90};
            int sum = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            System.out.println("The sum of even numbers is: " + sum);
        }
    }
