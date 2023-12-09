package Class5;

public class  E4LogicalOperators {
    public static void main(String[] args) {
/* change any of the boolean - if 1 conditions are TRUE then if is printed if ANY of them end up false
then ELSE is printed unless you use the or (!) */
        boolean bringFlower=false;
        boolean bringChoc=false;
        boolean myMistake=false;

        if (bringFlower || bringChoc || myMistake) { //
            System.out.println("happy");
        }else {
            System.out.println("Angry");
        }


    }
}
