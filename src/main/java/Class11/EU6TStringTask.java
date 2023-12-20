package Class11;

public class EU6TStringTask {
    public static void main(String[] args) {
        String str="Java is fun";

        /*char c= str.charAt(0);
        System.out.println(c);
        get charecters from the string one by one and
        print then on a new line */

        for (int i=0; i <str.length() ; i++){
            System.out.println(str.charAt(i));
        }
    }
}
