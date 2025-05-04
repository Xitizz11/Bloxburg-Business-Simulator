import java.util.ArrayList;

public class Business {
    // Private fields for encapsulation
    private String name;
    private String owner;
    private double funds;
    private ArrayList<Employee> employees;
    
    // Static field to track total businesses
    private static int totalBusinesses = 0;
    
    // Constants
    public static final double TAX_RATE = 0.1;
    public static final double DEFAULT_STARTING_FUNDS = 10000.0;
    public static final String DEFAULT_OWNER = "Player";
    
    // Overloaded constructors
    public Business(String name) {
        this(name, DEFAULT_OWNER, DEFAULT_STARTING_FUNDS);
    }
    
    public Business(String name, double startingFunds) {
        this(name, DEFAULT_OWNER, startingFunds);
    }
    
    public Business(String name, String owner, double startingFunds) {
        this.name = name;
        this.owner = owner;
        this.funds = startingFunds;
        this.employees = new ArrayList<>();
        totalBusinesses++;
    }
    
    // Business methods
    public void hireEmployee(String name, String role, double salary) {
        Employee newEmployee = new Employee(name, role, salary);
        employees.add(newEmployee);
        System.out.println(name + " hired as " + role + " at " + this.name);
    }
    
    public void paySalaries() {
        double totalSalaries = 0;
        for (Employee emp : employees) {
            totalSalaries += emp.getSalary();
        }
        
        if (funds >= totalSalaries) {
            funds -= totalSalaries;
            System.out.println("Paid $" + totalSalaries + " in salaries. Remaining funds: $" + funds);
        } else {
            System.out.println("Insufficient funds to pay salaries!");
        }
    }
    
    public void payTaxes() {
        double taxAmount = funds * TAX_RATE;
        funds -= taxAmount;
        System.out.println("Paid $" + taxAmount + " in taxes. Remaining funds: $" + funds);
    }
    
    public void addFunds(double amount) {
        funds += amount;
        System.out.println("Added $" + amount + " to business. New balance: $" + funds);
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public double getFunds() {
        return funds;
    }
    
    public static int getTotalBusinesses() {
        return totalBusinesses;
    }
    
    // Nested Employee class
    class Employee {
        private String name;
        private String role;
        private double salary;
        
        public Employee(String name, String role, double salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }
        
        // Getters
        public String getName() {
            return name;
        }
        
        public String getRole() {
            return role;
        }
        
        public double getSalary() {
            return salary;
        }
    }
}
