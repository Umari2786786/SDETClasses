package Class6;
/* This adds all the numbers up 12345678910.. so sum =0 then it adds what ever the 1 increments to ..
the line 8 sum=sum PLUS what ever the i is after looping! - watch debug */
public class EUTask8AddNumbers {
    public static void main(String[] args) {
        int sum=0;

        for (int i=1;i<=10;i++){

            sum=sum+i;
            
        }
        System.out.println(sum);
    }
}
