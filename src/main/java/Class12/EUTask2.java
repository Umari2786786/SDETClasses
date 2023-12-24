package Class12;

public class EUTask2 {
    public static void main(String[] args) {
        String str="umari2786! is learning Java"; /* string defined */

        System.out.println(str.replaceAll("[^A-Za-z]","").length());
        /* replace all exclusing the letters "^" = not so not A-Za-z..replaces everything
        else with nothing as per "" the . length at the end will give the total number of charecters left! */

    }
}
