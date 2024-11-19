package OOPS.L3.Encapsulation;

public class Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor to initialize values
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Public getter for id
    public int getId() {
        return id;
    }

    // Public setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary
    public void setSalary(double salary) {
        // Validation to ensure salary is positive
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }
}