package Class5;

public class E5LogicalOperators {
    public static void main(String[] args) {

        boolean is4gAvail=false;
        boolean isWifiAvail=true;


        if (is4gAvail||isWifiAvail) {
            System.out.println("you can browse");
        }else {
            System.out.println("can not use net");
        }

    }
}
