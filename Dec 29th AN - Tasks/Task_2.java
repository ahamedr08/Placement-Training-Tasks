// Base class Employee
class Employee {
    // Fields
    private String name;
    private int employeeID;

    // Constructor
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    // Method to calculate basic salary
    public double calculateSalary() {
        return 50000; // Basic salary for all employees
    }

    // Getters for name and employeeID
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}

// Subclass Manager
class Manager extends Employee {
    // Additional field
    private double bonusPercentage;

    // Constructor
    public Manager(String name, int employeeID, double bonusPercentage) {
        super(name, employeeID);
        this.bonusPercentage = bonusPercentage;
    }

    // Override calculateSalary method to include bonus
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * bonusPercentage / 100);
    }
}

// Subclass Developer
class Developer extends Employee {
    // Additional field
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeID, String programmingLanguage) {
        super(name, employeeID);
        this.programmingLanguage = programmingLanguage;
    }

    // Override calculateSalary method to include extra allowance
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 10000; // Extra allowance for developers
    }

    // Getter for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("John", 101, 15);
        Developer developer = new Developer("Ahamed", 201, "Java");

        // Call calculateSalary and print details
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeID());
        System.out.println("Bonus Percentage: " + manager.calculateSalary());
        System.out.println(); // Blank line for readability

        System.out.println("Developer Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeID());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        System.out.println("Salary: " + developer.calculateSalary());
    }
}
