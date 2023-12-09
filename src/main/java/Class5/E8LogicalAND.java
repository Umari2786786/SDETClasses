package Class5;

public class E8LogicalAND {
    public static void main(String[] args) {
        boolean con1 = true;
        boolean con2 = true;
        boolean con3 = false;
/* all conditions have to be true for "IF" to execute..
any are false the "ELSE" will print.*/

        if (con1 && con2 && con3) {
            System.out.println("IF");
        } else {
            System.out.println("ELSE");
        }
    }
}