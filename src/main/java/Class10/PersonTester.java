package Class10;

public class PersonTester {
    public static void main(String[] args) {

        Person Person1 = new Person();
        Person1.name="Female name";
        Person1.gender="Female";
        Person1.age=30;
        Person1.hair="black hair";

        System.out.println(Person1.name + " - " + Person1.gender);
        System.out.println(Person1.age + " - " + Person1.hair);
        System.out.println();
        Person1.shouting();
        Person1.shopping();
        Person1.sleeping();
    }
}