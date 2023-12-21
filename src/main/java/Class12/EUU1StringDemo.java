package Class12;

public class EUU1StringDemo {
    public static void main(String[] args) {

        String str="Its Saveras Bday. Its Sunday today. Its Java class";
        String[] strArr= str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());

    }
}
