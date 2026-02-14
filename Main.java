public class Main {
    
    public static void main(String[] args) {

        Employee emp1 = new Manager("David", 80000, 10000);
        Employee emp2 = new Developer("Jesus", 70000);
        Employee emp3 = new Employee("Giovani");

        System.out.println("---- Employee Information ----");
        System.out.println();

        emp1.displayInfo();
        System.out.println();

        emp2.displayInfo();
        System.out.println();

        emp3.displayInfo();
    }
}
