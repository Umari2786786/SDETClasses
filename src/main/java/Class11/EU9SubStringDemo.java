package Class11;

public class EU9SubStringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";

        System.out.println(str.substring(0,5));
        /* will print a part of it only ... the 2nd number declared as to be after the
        one you want to include - enter 5 will miss y! */

        System.out.println(str.substring(6,8)); /* this will equal "is" */
        System.out.println(str.substring(9,str.length()));/* this will equal "Saturday" */
        /* str.length will also equal "Saturday" */
        String str2="Java is fun";
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(8,11));

    }

}
