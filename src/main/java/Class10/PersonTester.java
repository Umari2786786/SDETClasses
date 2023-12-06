package Class10;

public class PersonTester {
    public static void main(String[] args) {

        Person p1 = new Person();
    p1.name="*****";
    p1.gender="Female";
    p1.age=30;
    p1.hobbies="chilling";

        System.out.println(p1.name + " - " + p1.gender);
        System.out.println(p1.age + " - " + p1.hobbies);
        System.out.println();
        p1.shouting();
        p1.shopping();
        p1.sleeping();
    }
}