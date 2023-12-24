package Class12;
/* This is the sentence I want to print in reverse  */
public class EUUReverPRinting {
    public static void main(String[] args) {
        String str = "This is the sentence I want to print in reverse";
        String[] words = str.split(" ");
        for (String w : words) {
            for (int i = w.length() - 1; i >= 0; i--) {
                System.out.print(w.charAt(i));
            }System.out.print(" ");
        }

    }

}