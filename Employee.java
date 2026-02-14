public class Employee {
    protected String name;
    protected double salary;

    // Constructor 1
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Constructor 2 
    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }
    
    // Method to be overridden
    public double  calculatePay() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
