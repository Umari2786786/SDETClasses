package Class11;
/* **** CHECK THE ASCII TABLE FOR NUMBERS REPRESENTING LETTERS NUMBERS CHARECTERS or www.regexr.com*/
public class EU11ReplaceAll {
    public static void main(String[] args) {
        String str="fd345gfdgSDF34**5SD67Fdfd!!fg d%fg&dFDG3 4###&%!5S!DFGfgdfg";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","-"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-D]", "+"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","=" ));/* ^ means replace everything else */
        System.out.println(str.replaceAll("[^A-Z]","!" ));/* ^ means not so dont replace uppercase A-Z but everything else */
        System.out.println(str.replaceAll("[!-?]","" )); /* ^ removes all special charexters */
        System.out.println(str.replaceAll("[#-*]","|" ));
        System.out.println(str.replaceAll("[\\d]","" )); /* \\ replaces any digits */
        System.out.println(str.replaceAll("[\\s]","" )); /* \\ replaces all spaces */
    }
}
