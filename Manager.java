public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return salary + bonus;
    }

    public void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Base Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Pay: $" + calculatePay());
    }
}
