package Class11;

public class E1StringDemo {
    public static void main(String[] args) {
        String str=new String("hello world"); /* "string is class already in java,
         String/variable name/ =new (class name again)*/

        System.out.println(str.length());
        System.out.println(str.toUpperCase());

        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(" hello Batch 18"));
        System.out.println(str+" hello Batch 18");
    }
}
