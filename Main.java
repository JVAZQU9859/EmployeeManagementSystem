import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        // Generic ArrayList to store Employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Add different types of employees
        employees.add(new Manager("David", 80000, 10000));
        employees.add(new Developer("Jesus", 70000));
        employees.add(new Employee("Giovani"));

        System.out.println("---- Employee Information ----\n");

        // Loop through list 
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }  
    }
}
