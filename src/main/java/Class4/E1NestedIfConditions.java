package Class4;

public class E1NestedIfConditions {
    public static void main(String[] args) {

        Boolean isMainDoorOpened=true;
        Boolean isRoom1Opened=false;
        Boolean isRoom2Opened=true;


        if (isMainDoorOpened) {

            if (isRoom1Opened) {
                System.out.println("we are in Room 1");
            } else {
                System.out.println("Room 1 is closed");
            }

        if (isRoom2Opened){
            System.out.println("we are in room 2");
        }else{
            System.out.println("room 2 is closed");
        }

        }else {
            System.out.println("cant enter the house main door is closed");
        }

    }
}
