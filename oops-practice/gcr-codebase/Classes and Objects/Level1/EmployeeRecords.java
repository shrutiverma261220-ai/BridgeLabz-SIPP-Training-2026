// Parent Class
class Employee {

    // Public Variable
    public int employeeID;

    // Protected Variable
    protected String department;

    // Private Variable
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public Setter Method
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public Getter Method
    public double getSalary() {
        return salary;
    }
}

// Child Class
class Manager extends Employee {

    // Constructor
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID : " + employeeID);   // Public
        System.out.println("Department  : " + department);   // Protected
        System.out.println("Salary      : ₹" + getSalary()); // Private via Getter
    }
}

// Main Class
public class EmployeeRecords {

    public static void main(String[] args) {

        Manager manager = new Manager(101, "IT", 75000);

        System.out.println("----- Employee Details -----");
        manager.displayDetails();

        // Modify Salary
        manager.setSalary(85000);

        System.out.println("\nAfter Salary Update:");
        manager.displayDetails();
    }
}