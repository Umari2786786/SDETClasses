package Class3;

public class Switch {
    public static void main(String[] args) {

        String day = "monday";

        switch (day) {
            case "sunday":
                System.out.println("it is Sunday");
                break;
            case "Monday":
                System.out.println("it is Monday");
                break;
            case "Tuesday":
                System.out.println("it is Tuesday");
                break;
            case "Wednesday":
                System.out.println("it is Wednesday");
                break;
            case "Thurday":
                System.out.println("it is Thursday");
                break;
            case "Friday":
                System.out.println("it is Friday");
                break;
            case "Saturday":
                System.out.println("it is Satuday");
                break;
            default:
                System.out.println("this is not the day");


        }
    }
}
