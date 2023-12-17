package Class10;

public class DogTester {
    public static void main(String[] args) {
Dog dog1= new Dog(); /* this link it with the dog class.
                   the class name//variable name/= new(class name again)*/
       dog1.name="Monty";
       dog1.breed="XL Bully";
       dog1.colour="Oreo";
       dog1.age=4;
       dog1.weight=25;

       System.out.println(dog1.name + " - "+ dog1.breed);
       System.out.println(dog1.colour + " - "+ dog1.age +" - "+dog1.weight);
       dog1.bark();
       dog1.eat();
       dog1.sleep();

       Dog dog2=new Dog();
        dog2.name="Growl";
        dog2.breed="American Pit Bull";
        dog2.colour="Sandy Brown";
        dog2.age=4;
        dog2.weight=35;

        System.out.println();

        System.out.println(dog2.name + " - "+ dog2.breed);
        System.out.println(dog2.colour + " - "+ dog2.age +" - "+dog2.weight);
        dog2.bark();
        dog2.eat();
        dog2.sleep();
    }
}
