package Class11;
/* print the index of A (shown mulitiple times)  */
public class EUTask8 {
    public static void main(String[] args) {
        String str = "Today is Saturday";
/* i = 0(starts at index 0)-- i equals to str.length (so means equals the whole phrase)-- increments */
        for (int i = 0; i < str.length(); i++) {
            /* str.char (what ever in i equals the value of "a" then  i will be printed) **CHECK DEBUG */
            if (str.charAt(i) == 'a') {
                System.out.println(i);
            }
        }
    }
}