package Class11;
/* String has off number of character and more than 3 .... print the middle character i.e Hello print l ! */

public class EUTask4 {
    public static void main(String[] args) {
        String str="Hello";
        if(!str.isEmpty()){
            int len=str.length();
            if (len>=3&&len%2!=0){
                System.out.println(str.charAt(len/2));
            }
        }
    }
}
