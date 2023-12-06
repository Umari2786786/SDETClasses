package Class4;

public class E_2NestedIfConditions {
    public static void main(String[] args) {

        double budget = 15000;
        String fueltype = "diesel";

        if (budget <= 50000) {
            if (fueltype.equals("diesel")) {
                System.out.println("I want a Audi");
            } else if (fueltype.equals("electric")) {
                System.out.println("I want Tesla");
            } else if (fueltype.equals("petrol")) {
                System.out.println("I want BMW");
            } else System.out.println("Non Available");
        }
        if ((budget >= 50001) && (budget < 999999)) {
            if (fueltype.equals("diesel")) {
                System.out.println("I want a G Wagon");
            } else if (fueltype.equals("electric")) {
                System.out.println("Tesla Model S");
            } else if (fueltype.equals("petrol")) {
                System.out.println("I want Audi RS4");
            } else System.out.println("Nothing Available my friend");
        }
        if (budget >= 100000) {
            System.out.println("you need a super Car Playaaa");
        } else {
            System.out.println("Nada Available");
        }
    }
}