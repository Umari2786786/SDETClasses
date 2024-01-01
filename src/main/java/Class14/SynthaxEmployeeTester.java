package Class14;

public class SynthaxEmployeeTester {
    public static void main(String[] args) {

        SynthaxEmployee emp1=new SynthaxEmployee();
        emp1.name="Salman Khan";
        emp1.empID=10001;
        emp1.salary=125595;
        emp1.printInfo();
        /* can also be printed like this -*/
        System.out.println(emp1.ceo);

        SynthaxEmployee emp2=new SynthaxEmployee();
        emp2.name="Akshaye Kumar";
        emp2.empID=10002;
        emp2.salary=150599;
        emp2.printInfo();
        /* can also be printed like this - RECOMMENDED WAY!! >>*/
        System.out.println(SynthaxEmployee.ceo);

    }
}
