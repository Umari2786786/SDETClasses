package Class8;

public class E8 {
    public static void main(String[] args) {
        int[] numbers = {101, 100, 25, 30, 25, 50, 300};
        int n5 = 0, n2 = 0;
        for (int x: numbers) {
           if(x%5==0) {
               n5++;
           }
           if (x%2==0){
               n2++;
           }
        }
        System.out.println("numbers divisable by 5 "+n5);
        System.out.println("numbers divisable by 2 "+n2);
    }
}