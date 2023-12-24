package Class12;

public class Task5Palindrome {
    public static void main(String[] args) {
        String str = "mom";
        String reversedWord="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord+str.charAt(i);
        }
                if (str.equalsIgnoreCase(reversedWord)) {
                    System.out.println("its a palindrome");
                } else {
                    System.out.println("its not a palindrome");
                }
            }
        }

