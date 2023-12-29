package Class13;

public class EUTask3 {
    void isPalidorme(String word){
        String reverseName=" ";

        for (int i =word.length()-1;i>=0;i--) {
            reverseName = reverseName + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseName)){
            System.out.println("its a Palindrome");
        }else {
            System.out.println("its not a Palindrome");
        }
        }
    }