import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

       System.out.println("Employee Management System");
       System.out.println("--------------------------");

       boolean running = true;

       while (running) {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Manager");
        System.out.println("2. Add Developer");
        System.out.println("3. View Employees");
        System.out.println("4. Exit");

        int choice;

        try {
            choice = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            continue;
        }
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter name: ");
                String mName = scanner.nextLine();

                System.out.print("Enter salary: ");
                double mSalary;
                try {
                    mSalary = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("Invalid salary. Must be a number.");
                    scanner.nextLine();
                    break;
                }

                System.out.print("Enter bonus: ");
                double bonus;
                try {
                    bonus = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("Invalid bonus. Must be a number.");
                    scanner.nextLine();
                    break;
                }
                scanner.nextLine();

                employees.add(new Manager(mName, mSalary, bonus));
                System.out.println("Manager added successfully.");
                break;

            case 2:
                System.out.print("Enter name: ");
                String dName = scanner.nextLine();

                System.out.print("Enter salary: ");
                double dSalary;
                try {
                    dSalary = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("Invalid salary. Must be a number.");
                    scanner.nextLine();
                    break;
                }
                scanner.nextLine();

                employees.add(new Developer(dName, dSalary));
                System.out.println("Developer added successfully.");
                break;

            case 3:
                System.out.println("\n--- Employee List ---");
                for (Employee emp : employees) {
                    emp.displayInfo();
                    System.out.println();
                }
                break;

            case 4:
                running = false;
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
       }     
       
       scanner.close();
    }
}   