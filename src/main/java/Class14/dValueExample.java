package Class14;

//declare static class names below
public class dValueExample {
    //declare the input type for the class
    static int dValue(int num){
        //declare what it will do (return)
        return num*2;
    }

    public static void main(String[] args) {
        /*call the class (named above)
        dValueExample T=new dValueExample();
        //sout the static input variable declared above - amd wprk out the sum for you ...
        // above asked it to get the value (saved under num) and x 2.
        System.out.println(dValueExample.dValue(10));*/

        //EASIER WAY OF DOING IT IS....
        // name the class (dValueExample) then the variable(dValue) then the user input
        System.out.println(dValueExample.dValue(100));
    }
}
