package Class10;

public class EUDogTester {
    public static void main(String[] args) {
        EUDog pitbull=new EUDog();
        /* above is linking to the other class
        - class name/name it(variable)/=new/Class name again */

        pitbull.name="Dutchess";
        pitbull.colour="Sandy Brown";
        pitbull.breed="American Pitbull";
        pitbull.age=3;
        pitbull.weight=50.5;
        System.out.println(pitbull.name+", "+pitbull.colour+", "+pitbull.breed+", "+pitbull.age+", "+pitbull.weight);
        System.out.println();
        pitbull.bark();
        pitbull.eat();
        pitbull.sleep();

        System.out.println();
        System.out.println();

        EUDog German=new EUDog();
        German.name="Monty";
        German.colour="Brown Black";
        German.breed="German Shepherd";
        German.age=4;
        German.weight=60;

        System.out.println(German.name+", "+German.colour+", "+German.breed+", "+German.age+", "+German.weight);
        System.out.println();

        German.eat();
        German.bark();
        German.sleep();

    }
}
