package Class14;

public class Cat {
//  Instance variable - outside the body of the main code!
    String name="Kitty Kat";


// 1st priority is LOCAL VARIABLE - which is outside the "main " body of code
    void printName(){
        String name="KitKat";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
