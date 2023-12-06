package Class12;

public class T5String {
    public static void main(String[] args) {
        String str = "This is the sentence I want to reverse";

        String[] words = str.split(" ");

        for (String w : words) {

            for (int i = w.length() - 1; i >= 0; i--) {
                System.out.print(w.charAt(i));
            }
                System.out.print(" ");
            }
        }
    }

