public class BloxburgGame {
    public static void main(String[] args) {
        // Create businesses using different constructors
        Business cafe = new Business("Blox Cafe");
        Business restaurant = new Business("Awesome Restaurant", 20000.0);
        Business techCompany = new Business("Tech Innovations", "Diana Rey", 50000.0);
        
        // Display total businesses created
        System.out.println("Total businesses created: " + Business.getTotalBusinesses());
        
        // Hire employees for each business
        cafe.hireEmployee("Cobb", "Barista", 1900.0);
        cafe.hireEmployee("Tina", "Cashier", 1600.0);
        
        restaurant.hireEmployee("Reygon", "Chef", 3400.0);
        restaurant.hireEmployee("Rika", "Waiter", 2100.0);
        restaurant.hireEmployee("Elvis", "Host", 1900.0);
        
        techCompany.hireEmployee("Ronald", "Developer", 4900.0);
        techCompany.hireEmployee("Gena", "Designer", 4400.0);
        
        // Simulate business operations
        System.out.println("\n--- Business Operations ---");
        
        System.out.println("\n" + cafe.getName() + " operations:");
        cafe.addFunds(4000.0);
        cafe.paySalaries();
        cafe.payTaxes();
        
        System.out.println("\n" + restaurant.getName() + " operations:");
        restaurant.paySalaries();
        restaurant.payTaxes();
        
        System.out.println("\n" + techCompany.getName() + " operations:");
        techCompany.paySalaries();
        techCompany.payTaxes();
    }
}
