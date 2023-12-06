package Class8;

public class E2ArraysNames {
    public static void main(String[] args) {

        String [] names={"Aidos","Zeeshan","Abid", "sharif","Zeeshan"};
        int count=0;
        for (int i =0; i <names.length; i++){
            if (names[i].equals("Zeeshan")){
        count++;
            }
        }
        System.out.println("z appears "+count+" times");
    }
}