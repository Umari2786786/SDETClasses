package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone p1= new Phone();
        String make;
        String model;
        String colour;
        double memory;

        System.out.println(p1.make + " - "+ p1.model);
        System.out.println(p1.colour + " - "+ p1.memory);
        p1.calling();
        p1.music();
        p1.sleep();
    }
}
