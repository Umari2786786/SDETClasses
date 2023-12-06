package Class12;

public class Task4String {
    public static void main(String[] args) {
        String dadname="Daniel";
        String mumname="Mary";
        Boolean isBoy=false;

        if (isBoy){
            String fatherFirstPart=dadname.substring(0,dadname.length()/2);
            String motherLastPart=mumname.substring(mumname.length()/2,mumname.length());
            System.out.println(fatherFirstPart+motherLastPart.trim());
        } else {
            String motherFirstPart=mumname.substring(0,mumname.length()/2);
            String fatherLastPart=dadname.substring(dadname.length()/2,dadname.length());
            System.out.println(motherFirstPart+fatherLastPart.trim());
        }
    }
}
