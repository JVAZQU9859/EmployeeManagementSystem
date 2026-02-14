public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void displayInfo() {
        System.out.println("Developer: " + name);
        System.out.println("Salary: $" + salary);
    }
}
