package Class10;

public class EUCarTester {
    public static void main(String[] args) {

        EUCar bmw=new EUCar();

        bmw.make="BMW";
        bmw.model="M4";
        bmw.colour="Midnight Blue";
        bmw.fueltype="Petrol";
        bmw.yearmade="2020";
        bmw.enginesize=3.0;
        System.out.println();

        System.out.println(bmw.make+", "+bmw.model+", "+bmw.colour+", "+bmw.fueltype+", "+bmw.yearmade+", "+bmw.enginesize);
        System.out.println();

        bmw.ignition();
        bmw.engine();
        bmw.drift();
        bmw.off();

    }
}
